package com.nide8.login2.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/util/IOUtils.class */
public final class IOUtils {
    public static byte[] getURL(java.lang.String r4) throws java.io.IOException {
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r5 = r0
            r0 = r5
            java.io.InputStream r0 = r0.getInputStream()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            byte[] r0 = asBytes(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Throwable -> L45
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L3a
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L3a
        L2b:
            r9 = move-exception
            r0 = r7
            r1 = r9
            r0.addSuppressed(r1)
            goto L3a
        L36:
            r0 = r6
            r0.close()
        L3a:
            r0 = r8
            return r0
        L3d:
            r8 = move-exception
            r0 = r8
            r7 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r10 = move-exception
            r0 = r6
            if (r0 == 0) goto L65
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L56
            goto L65
        L56:
            r11 = move-exception
            r0 = r7
            r1 = r11
            r0.addSuppressed(r1)
            goto L65
        L61:
            r0 = r6
            r0.close()
        L65:
            r0 = r10
            throw r0
    }

    public static byte[] loadFile(java.nio.file.Path r4) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r4
            java.io.File r2 = r2.toFile()
            r1.<init>(r2)
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            byte[] r0 = asBytes(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L3a
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L33
            r0 = r6
            if (r0 == 0) goto L2f
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L24
            goto L33
        L24:
            r8 = move-exception
            r0 = r6
            r1 = r8
            r0.addSuppressed(r1)
            goto L33
        L2f:
            r0 = r5
            r0.close()
        L33:
            r0 = r7
            return r0
        L35:
            r7 = move-exception
            r0 = r7
            r6 = r0
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r9 = move-exception
            r0 = r5
            if (r0 == 0) goto L5a
            r0 = r6
            if (r0 == 0) goto L56
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L4b
            goto L5a
        L4b:
            r10 = move-exception
            r0 = r6
            r1 = r10
            r0.addSuppressed(r1)
            goto L5a
        L56:
            r0 = r5
            r0.close()
        L5a:
            r0 = r9
            throw r0
    }

    public static byte[] asBytes(java.io.InputStream r5) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r7 = r0
        Le:
            r0 = r5
            r1 = r7
            int r0 = r0.read(r1)
            r1 = r0
            r8 = r1
            r1 = -1
            if (r0 == r1) goto L23
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r0.write(r1, r2, r3)
            goto Le
        L23:
            r0 = r6
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public static void saveFile(java.nio.file.Path r7, java.lang.String r8) throws java.io.IOException {
            r0 = r7
            r1 = r8
            byte[] r1 = r1.getBytes()
            r2 = 2
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]
            r3 = r2
            r4 = 0
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.CREATE
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            r3[r4] = r5
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)
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
