package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class PrfHmacJce implements com.google.crypto.tink.prf.Prf {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final java.lang.String algorithm;
    private final java.security.Key key;
    private final java.lang.ThreadLocal<javax.crypto.Mac> localMac;
    private final int maxOutputLength;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.PrfHmacJce.FIPS = r0
            return
    }

    public PrfHmacJce(java.lang.String r3, java.security.Key r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.subtle.PrfHmacJce$1 r0 = new com.google.crypto.tink.subtle.PrfHmacJce$1
            r0.<init>(r2)
            r2.localMac = r0
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r1 = com.google.crypto.tink.subtle.PrfHmacJce.FIPS
            boolean r1 = r1.isCompatible()
            if (r1 == 0) goto L9d
            r2.algorithm = r3
            r2.key = r4
            byte[] r4 = r4.getEncoded()
            int r4 = r4.length
            r1 = 16
            if (r4 < r1) goto L95
            r3.hashCode()
            int r4 = r3.hashCode()
            r1 = -1
            switch(r4) {
                case -1823053428: goto L57;
                case 392315023: goto L4c;
                case 392315118: goto L41;
                case 392316170: goto L36;
                case 392317873: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L61
        L2b:
            java.lang.String r4 = "HMACSHA512"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L34
            goto L61
        L34:
            r1 = 4
            goto L61
        L36:
            java.lang.String r4 = "HMACSHA384"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L3f
            goto L61
        L3f:
            r1 = 3
            goto L61
        L41:
            java.lang.String r4 = "HMACSHA256"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L4a
            goto L61
        L4a:
            r1 = 2
            goto L61
        L4c:
            java.lang.String r4 = "HMACSHA224"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L55
            goto L61
        L55:
            r1 = 1
            goto L61
        L57:
            java.lang.String r4 = "HMACSHA1"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L60
            goto L61
        L60:
            r1 = 0
        L61:
            switch(r1) {
                case 0: goto L8d;
                case 1: goto L88;
                case 2: goto L83;
                case 3: goto L7e;
                case 4: goto L79;
                default: goto L64;
            }
        L64:
            java.security.NoSuchAlgorithmException r4 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unknown Hmac algorithm: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L79:
            r3 = 64
            r2.maxOutputLength = r3
            goto L91
        L7e:
            r3 = 48
            r2.maxOutputLength = r3
            goto L91
        L83:
            r3 = 32
            r2.maxOutputLength = r3
            goto L91
        L88:
            r3 = 28
            r2.maxOutputLength = r3
            goto L91
        L8d:
            r3 = 20
            r2.maxOutputLength = r3
        L91:
            r0.get()
            return
        L95:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r4 = "key size too small, need at least 16 bytes"
            r3.<init>(r4)
            throw r3
        L9d:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ java.lang.String access$000(com.google.crypto.tink.subtle.PrfHmacJce r0) {
            java.lang.String r0 = r0.algorithm
            return r0
    }

    static /* synthetic */ java.security.Key access$100(com.google.crypto.tink.subtle.PrfHmacJce r0) {
            java.security.Key r0 = r0.key
            return r0
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r2, int r3) throws java.security.GeneralSecurityException {
            r1 = this;
            int r0 = r1.maxOutputLength
            if (r3 > r0) goto L20
            java.lang.ThreadLocal<javax.crypto.Mac> r0 = r1.localMac
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r0.update(r2)
            java.lang.ThreadLocal<javax.crypto.Mac> r2 = r1.localMac
            java.lang.Object r2 = r2.get()
            javax.crypto.Mac r2 = (javax.crypto.Mac) r2
            byte[] r2 = r2.doFinal()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
        L20:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too big"
            r2.<init>(r3)
            throw r2
    }

    public int getMaxOutputLength() {
            r1 = this;
            int r0 = r1.maxOutputLength
            return r0
    }
}
