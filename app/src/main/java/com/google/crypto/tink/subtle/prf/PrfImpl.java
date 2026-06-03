package com.google.crypto.tink.subtle.prf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public class PrfImpl implements com.google.crypto.tink.prf.Prf {
    private final com.google.crypto.tink.subtle.prf.StreamingPrf prfStreamer;

    private PrfImpl(com.google.crypto.tink.subtle.prf.StreamingPrf r1) {
            r0 = this;
            r0.<init>()
            r0.prfStreamer = r1
            return
    }

    private static byte[] readBytesFromStream(java.io.InputStream r3, int r4) throws java.security.GeneralSecurityException {
            byte[] r0 = new byte[r4]     // Catch: java.io.IOException -> L18
            r1 = 0
        L3:
            if (r1 >= r4) goto L17
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)     // Catch: java.io.IOException -> L18
            if (r2 <= 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.io.IOException -> L18
            java.lang.String r4 = "Provided StreamingPrf terminated before providing requested number of bytes."
            r3.<init>(r4)     // Catch: java.io.IOException -> L18
            throw r3     // Catch: java.io.IOException -> L18
        L17:
            return r0
        L18:
            r3 = move-exception
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r3)
            throw r4
    }

    public static com.google.crypto.tink.subtle.prf.PrfImpl wrap(com.google.crypto.tink.subtle.prf.StreamingPrf r1) {
            com.google.crypto.tink.subtle.prf.PrfImpl r0 = new com.google.crypto.tink.subtle.prf.PrfImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r2, int r3) throws java.security.GeneralSecurityException {
            r1 = this;
            if (r2 == 0) goto L17
            if (r3 <= 0) goto Lf
            com.google.crypto.tink.subtle.prf.StreamingPrf r0 = r1.prfStreamer
            java.io.InputStream r2 = r0.computePrf(r2)
            byte[] r2 = readBytesFromStream(r2, r3)
            return r2
        Lf:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Invalid outputLength specified."
            r2.<init>(r3)
            throw r2
        L17:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Invalid input provided."
            r2.<init>(r3)
            throw r2
    }
}
