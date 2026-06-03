package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftSkinUploader {
    private static final java.lang.String SKIN_UPLOAD_URL = "https://api.minecraftservices.com/minecraft/profile/skins";

    private MicrosoftSkinUploader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String readFully(java.io.InputStream r4) throws java.io.IOException {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r4, r3)
            r1.<init>(r2)
        L16:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L20
            r0.append(r4)     // Catch: java.lang.Throwable -> L28
            goto L16
        L20:
            r1.close()
            java.lang.String r4 = r0.toString()
            return r4
        L28:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)
        L31:
            throw r4
    }

    public static void uploadSkin(java.lang.String r11, java.io.File r12, ca.dnamobile.javalauncher.skin.SkinModelType r13) throws java.io.IOException {
            java.lang.String r0 = "--"
            java.lang.String r1 = r11.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L12f
            boolean r1 = r12.isFile()
            if (r1 == 0) goto L127
            boolean r1 = ca.dnamobile.javalauncher.skin.CustomSkinStore.isSkinValid(r12)
            if (r1 == 0) goto L11f
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            if (r13 != r1) goto L1f
            java.lang.String r13 = "slim"
            goto L21
        L1f:
            java.lang.String r13 = "classic"
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JavaLauncherSkinBoundary"
            r1.<init>(r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "-"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.net.URL r2 = new java.net.URL
            java.lang.String r3 = "https://api.minecraftservices.com/minecraft/profile/skins"
            r2.<init>(r3)
            java.net.URLConnection r2 = r2.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)
            r3 = 1
            r2.setDoInput(r3)
            r2.setDoOutput(r3)
            r3 = 0
            r2.setUseCaches(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Bearer "
            r3.<init>(r5)
            java.lang.StringBuilder r11 = r3.append(r11)
            java.lang.String r11 = r11.toString()
            java.lang.String r3 = "Authorization"
            r2.setRequestProperty(r3, r11)
            java.lang.String r11 = "Accept"
            java.lang.String r3 = "application/json"
            r2.setRequestProperty(r11, r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r3 = "multipart/form-data; boundary="
            r11.<init>(r3)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            java.lang.String r3 = "Content-Type"
            r2.setRequestProperty(r3, r11)
            java.io.OutputStream r11 = r2.getOutputStream()
            java.lang.String r3 = "variant"
            writeTextPart(r11, r1, r3, r13)     // Catch: java.lang.Throwable -> L113
            java.lang.String r7 = "file"
            java.lang.String r8 = "skin.png"
            java.lang.String r9 = "image/png"
            r5 = r11
            r6 = r1
            r10 = r12
            writeFilePart(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L113
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L113
            java.lang.StringBuilder r12 = r12.append(r1)     // Catch: java.lang.Throwable -> L113
            java.lang.String r13 = "--\r\n"
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L113
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L113
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L113
            byte[] r12 = r12.getBytes(r13)     // Catch: java.lang.Throwable -> L113
            r11.write(r12)     // Catch: java.lang.Throwable -> L113
            if (r11 == 0) goto Lc2
            r11.close()
        Lc2:
            int r11 = r2.getResponseCode()
            r12 = 300(0x12c, float:4.2E-43)
            r13 = 200(0xc8, float:2.8E-43)
            if (r11 < r13) goto Ld3
            if (r11 >= r12) goto Ld3
            java.io.InputStream r0 = r2.getInputStream()
            goto Ld7
        Ld3:
            java.io.InputStream r0 = r2.getErrorStream()
        Ld7:
            java.lang.String r0 = readFully(r0)
            r2.disconnect()
            if (r11 < r13) goto Le4
            if (r11 < r12) goto Le3
            goto Le4
        Le3:
            return
        Le4:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Minecraft skin upload failed: HTTP "
            r13.<init>(r1)
            java.lang.StringBuilder r11 = r13.append(r11)
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto Lf8
            goto L107
        Lf8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r13.<init>(r1)
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r4 = r13.toString()
        L107:
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L113:
            r12 = move-exception
            if (r11 == 0) goto L11e
            r11.close()     // Catch: java.lang.Throwable -> L11a
            goto L11e
        L11a:
            r11 = move-exception
            r12.addSuppressed(r11)
        L11e:
            throw r12
        L11f:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid skin. Use a 64x64 or 64x32 PNG skin."
            r11.<init>(r12)
            throw r11
        L127:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Selected skin file was not found."
            r11.<init>(r12)
            throw r11
        L12f:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Missing Minecraft access token. Refresh the Microsoft account and try again."
            r11.<init>(r12)
            throw r11
    }

    private static void writeFilePart(java.io.OutputStream r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "--"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\r\n"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r1)
            r2.write(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Content-Disposition: form-data; name=\""
            r3.<init>(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\"; filename=\""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = "\"\r\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            r2.write(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Content-Type: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = "\r\n\r\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            r2.write(r3)
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r7)
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L86
        L6d:
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L86
            r6 = -1
            if (r5 == r6) goto L79
            r6 = 0
            r2.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L86
            goto L6d
        L79:
            r3.close()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r0.getBytes(r3)
            r2.write(r3)
            return
        L86:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r3 = move-exception
            r2.addSuppressed(r3)
        L8f:
            throw r2
    }

    private static void writeTextPart(java.io.OutputStream r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "--"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\r\n"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r1)
            r2.write(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Content-Disposition: form-data; name=\""
            r3.<init>(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\"\r\n\r\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            r2.write(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r5.getBytes(r3)
            r2.write(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r0.getBytes(r3)
            r2.write(r3)
            return
    }
}
