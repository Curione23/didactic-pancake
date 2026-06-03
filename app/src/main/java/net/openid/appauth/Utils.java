package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
class Utils {
    private static final int INITIAL_READ_BUFFER_SIZE = 1024;

    private Utils() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static void closeQuietly(java.io.InputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static java.lang.String readInputStream(java.io.InputStream r4) throws java.io.IOException {
            if (r4 == 0) goto L26
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            r4 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r4]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L15:
            int r2 = r0.read(r4)
            r3 = -1
            if (r2 == r3) goto L21
            r3 = 0
            r1.append(r4, r3, r2)
            goto L15
        L21:
            java.lang.String r4 = r1.toString()
            return r4
        L26:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Input stream must not be null"
            r4.<init>(r0)
            throw r4
    }
}
