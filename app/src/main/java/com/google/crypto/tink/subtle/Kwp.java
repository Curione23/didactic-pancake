package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public class Kwp implements com.google.crypto.tink.KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = null;
    static final int ROUNDS = 6;
    private final javax.crypto.SecretKey aesKey;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-90, 89, 89, -90} // fill-array
            com.google.crypto.tink.subtle.Kwp.PREFIX = r0
            return
    }

    public Kwp(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 16
            if (r0 == r1) goto L16
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto Le
            goto L16
        Le:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unsupported key length"
            r3.<init>(r0)
            throw r3
        L16:
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.aesKey = r0
            return
    }

    private byte[] computeW(byte[] r17, byte[] r18) throws java.security.GeneralSecurityException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r2.length
            r4 = 8
            if (r3 <= r4) goto L74
            int r3 = r2.length
            r5 = 2147483631(0x7fffffef, float:NaN)
            if (r3 > r5) goto L74
            int r3 = r1.length
            if (r3 != r4) goto L74
            int r3 = r2.length
            int r3 = r0.wrappingSize(r3)
            byte[] r5 = new byte[r3]
            int r6 = r1.length
            r7 = 0
            java.lang.System.arraycopy(r1, r7, r5, r7, r6)
            int r1 = r2.length
            java.lang.System.arraycopy(r2, r7, r5, r4, r1)
            int r3 = r3 / r4
            r1 = 1
            int r3 = r3 - r1
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r2 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r6 = "AES/ECB/NoPadding"
            java.lang.Object r2 = r2.getInstance(r6)
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            javax.crypto.SecretKey r6 = r0.aesKey
            r2.init(r1, r6)
            r6 = 16
            byte[] r8 = new byte[r6]
            java.lang.System.arraycopy(r5, r7, r8, r7, r4)
            r9 = r7
        L3e:
            r10 = 6
            if (r9 >= r10) goto L70
            r10 = r7
        L42:
            if (r10 >= r3) goto L6c
            int r11 = r10 + 1
            int r12 = r11 * 8
            java.lang.System.arraycopy(r5, r12, r8, r4, r4)
            r2.doFinal(r8, r7, r6, r8)
            int r13 = r9 * r3
            int r13 = r13 + r10
            int r13 = r13 + r1
            r10 = r7
        L53:
            r14 = 4
            if (r10 >= r14) goto L66
            int r14 = 7 - r10
            r15 = r8[r14]
            r1 = r13 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r1 = r1 ^ r15
            byte r1 = (byte) r1
            r8[r14] = r1
            int r13 = r13 >>> r4
            int r10 = r10 + 1
            r1 = 1
            goto L53
        L66:
            java.lang.System.arraycopy(r8, r4, r5, r12, r4)
            r10 = r11
            r1 = 1
            goto L42
        L6c:
            int r9 = r9 + 1
            r1 = 1
            goto L3e
        L70:
            java.lang.System.arraycopy(r8, r7, r5, r7, r4)
            return r5
        L74:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "computeW called with invalid parameters"
            r1.<init>(r2)
            throw r1
    }

    private byte[] invertW(byte[] r18) throws java.security.GeneralSecurityException {
            r17 = this;
            r0 = r18
            int r1 = r0.length
            r2 = 24
            if (r1 < r2) goto L69
            int r1 = r0.length
            r2 = 8
            int r1 = r1 % r2
            if (r1 != 0) goto L69
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r0.length
            int r1 = r1 / r2
            int r3 = r1 + (-1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r4 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r5 = "AES/ECB/NoPadding"
            java.lang.Object r4 = r4.getInstance(r5)
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = r17
            javax.crypto.SecretKey r6 = r5.aesKey
            r7 = 2
            r4.init(r7, r6)
            r6 = 16
            byte[] r8 = new byte[r6]
            r9 = 0
            java.lang.System.arraycopy(r0, r9, r8, r9, r2)
            r10 = 5
        L31:
            if (r10 < 0) goto L65
            int r11 = r1 + (-2)
        L35:
            if (r11 < 0) goto L61
            int r12 = r11 + 1
            int r12 = r12 * r2
            java.lang.System.arraycopy(r0, r12, r8, r2, r2)
            int r13 = r10 * r3
            int r13 = r13 + r11
            int r13 = r13 + 1
            r14 = r9
        L43:
            r15 = 4
            if (r14 >= r15) goto L57
            int r15 = 7 - r14
            r16 = r8[r15]
            r7 = r13 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r7 = r16 ^ r7
            byte r7 = (byte) r7
            r8[r15] = r7
            int r13 = r13 >>> r2
            int r14 = r14 + 1
            r7 = 2
            goto L43
        L57:
            r4.doFinal(r8, r9, r6, r8)
            java.lang.System.arraycopy(r8, r2, r0, r12, r2)
            int r11 = r11 + (-1)
            r7 = 2
            goto L35
        L61:
            int r10 = r10 + (-1)
            r7 = 2
            goto L31
        L65:
            java.lang.System.arraycopy(r8, r9, r0, r9, r2)
            return r0
        L69:
            r5 = r17
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Incorrect data size"
            r0.<init>(r1)
            throw r0
    }

    private int wrappingSize(int r2) {
            r1 = this;
            int r0 = r2 + 7
            int r0 = r0 % 8
            int r0 = 7 - r0
            int r2 = r2 + r0
            int r2 = r2 + 8
            return r2
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] r7) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 16
            int r1 = r6.wrappingSize(r1)
            if (r0 < r1) goto L71
            int r0 = r7.length
            r1 = 4096(0x1000, float:5.74E-42)
            int r1 = r6.wrappingSize(r1)
            if (r0 > r1) goto L69
            int r0 = r7.length
            r1 = 8
            int r0 = r0 % r1
            if (r0 != 0) goto L61
            byte[] r7 = r6.invertW(r7)
            r0 = 1
            r2 = 0
            r3 = r2
        L1f:
            r4 = 4
            if (r3 >= r4) goto L2e
            byte[] r4 = com.google.crypto.tink.subtle.Kwp.PREFIX
            r4 = r4[r3]
            r5 = r7[r3]
            if (r4 == r5) goto L2b
            r0 = r2
        L2b:
            int r3 = r3 + 1
            goto L1f
        L2e:
            r3 = r2
        L2f:
            if (r4 >= r1) goto L3b
            int r3 = r3 << 8
            r5 = r7[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L2f
        L3b:
            int r4 = r6.wrappingSize(r3)
            int r5 = r7.length
            if (r4 == r5) goto L43
            goto L51
        L43:
            int r4 = r3 + 8
        L45:
            int r5 = r7.length
            if (r4 >= r5) goto L50
            r5 = r7[r4]
            if (r5 == 0) goto L4d
            r0 = r2
        L4d:
            int r4 = r4 + 1
            goto L45
        L50:
            r2 = r0
        L51:
            if (r2 == 0) goto L59
            int r3 = r3 + r1
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r1, r3)
            return r7
        L59:
            javax.crypto.BadPaddingException r7 = new javax.crypto.BadPaddingException
            java.lang.String r0 = "Invalid padding"
            r7.<init>(r0)
            throw r7
        L61:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Wrapped key size must be a multiple of 8 bytes"
            r7.<init>(r0)
            throw r7
        L69:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Wrapped key size is too large"
            r7.<init>(r0)
            throw r7
        L71:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Wrapped key size is too small"
            r7.<init>(r0)
            throw r7
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] r7) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 16
            if (r0 < r1) goto L34
            int r0 = r7.length
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 > r1) goto L2c
            r0 = 8
            byte[] r1 = new byte[r0]
            byte[] r2 = com.google.crypto.tink.subtle.Kwp.PREFIX
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
        L15:
            r2 = 4
            if (r4 >= r2) goto L27
            int r2 = r4 + 4
            int r3 = r7.length
            int r5 = 3 - r4
            int r5 = r5 * r0
            int r3 = r3 >> r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r4 = r4 + 1
            goto L15
        L27:
            byte[] r7 = r6.computeW(r1, r7)
            return r7
        L2c:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Key size of key to wrap too large"
            r7.<init>(r0)
            throw r7
        L34:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Key size of key to wrap too small"
            r7.<init>(r0)
            throw r7
    }
}
