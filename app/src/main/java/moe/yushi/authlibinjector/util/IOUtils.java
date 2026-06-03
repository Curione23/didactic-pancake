package moe.yushi.authlibinjector.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/IOUtils.class */
public final class IOUtils {
    public static final java.lang.String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    public static final java.lang.String CONTENT_TYPE_TEXT = "text/plain; charset=utf-8";

    private static java.net.HttpURLConnection createConnection(java.lang.String r4, java.net.Proxy r5) throws java.io.IOException {
            r0 = r5
            if (r0 != 0) goto L13
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            return r0
        L13:
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r1 = r5
            java.net.URLConnection r0 = r0.openConnection(r1)
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            return r0
    }

    public static byte[] http(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r0 = r4
            r1 = r5
            r2 = 0
            byte[] r0 = http(r0, r1, r2)
            return r0
    }

    public static byte[] http(java.lang.String r3, java.lang.String r4, java.net.Proxy r5) throws java.io.IOException {
            r0 = r4
            r1 = r5
            java.net.HttpURLConnection r0 = createConnection(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r3
            r0.setRequestMethod(r1)
            r0 = r6
            java.io.InputStream r0 = r0.getInputStream()
            r7 = r0
            r0 = r7
            byte[] r0 = asBytes(r0)     // Catch: java.lang.Throwable -> L25
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r7
            r0.close()
        L22:
            r0 = r8
            return r0
        L25:
            r8 = move-exception
            r0 = r7
            if (r0 == 0) goto L3d
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L3d
        L34:
            r9 = move-exception
            r0 = r8
            r1 = r9
            r0.addSuppressed(r1)
        L3d:
            r0 = r8
            throw r0
    }

    public static byte[] http(java.lang.String r6, java.lang.String r7, byte[] r8, java.lang.String r9) throws java.io.IOException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            byte[] r0 = http(r0, r1, r2, r3, r4)
            return r0
    }

    public static byte[] http(java.lang.String r4, java.lang.String r5, byte[] r6, java.lang.String r7, java.net.Proxy r8) throws java.io.IOException {
            r0 = r5
            r1 = r8
            java.net.HttpURLConnection r0 = createConnection(r0, r1)
            r9 = r0
            r0 = r9
            r1 = r4
            r0.setRequestMethod(r1)
            r0 = r9
            r1 = 1
            r0.setDoOutput(r1)
            r0 = r9
            java.lang.String r1 = "Content-Type"
            r2 = r7
            r0.setRequestProperty(r1, r2)
            r0 = r9
            java.io.OutputStream r0 = r0.getOutputStream()
            r10 = r0
            r0 = r10
            r1 = r6
            r0.write(r1)     // Catch: java.lang.Throwable -> L36
            r0 = r10
            if (r0 == 0) goto L51
            r0 = r10
            r0.close()
            goto L51
        L36:
            r11 = move-exception
            r0 = r10
            if (r0 == 0) goto L4e
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L45
            goto L4e
        L45:
            r12 = move-exception
            r0 = r11
            r1 = r12
            r0.addSuppressed(r1)
        L4e:
            r0 = r11
            throw r0
        L51:
            r0 = r9
            java.io.InputStream r0 = r0.getInputStream()
            r10 = r0
            r0 = r10
            byte[] r0 = asBytes(r0)     // Catch: java.lang.Throwable -> L6c
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L69
            r0 = r10
            r0.close()
        L69:
            r0 = r11
            return r0
        L6c:
            r11 = move-exception
            r0 = r10
            if (r0 == 0) goto L84
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> L7b
            goto L84
        L7b:
            r12 = move-exception
            r0 = r11
            r1 = r12
            r0.addSuppressed(r1)
        L84:
            r0 = r11
            throw r0
    }

    public static byte[] asBytes(java.io.InputStream r3) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            r1 = r4
            transfer(r0, r1)
            r0 = r4
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public static void transfer(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r7 = r0
        L6:
            r0 = r5
            r1 = r7
            int r0 = r0.read(r1)
            r1 = r0
            r8 = r1
            r1 = -1
            if (r0 == r1) goto L1b
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r0.write(r1, r2, r3)
            goto L6
        L1b:
            return
    }

    public static java.lang.String asString(byte[] r5) {
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r5
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r3)
            return r0
    }

    public static java.lang.String removeNewLines(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "\r"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.io.UncheckedIOException newUncheckedIOException(java.lang.String r6) throws java.io.UncheckedIOException {
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r1 = r0
            java.io.IOException r2 = new java.io.IOException
            r3 = r2
            r4 = r6
            r3.<init>(r4)
            r1.<init>(r2)
            return r0
    }

    public static java.io.UncheckedIOException newUncheckedIOException(java.lang.String r7, java.lang.Throwable r8) throws java.io.UncheckedIOException {
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r1 = r0
            java.io.IOException r2 = new java.io.IOException
            r3 = r2
            r4 = r7
            r5 = r8
            r3.<init>(r4, r5)
            r1.<init>(r2)
            return r0
    }

    private IOUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
