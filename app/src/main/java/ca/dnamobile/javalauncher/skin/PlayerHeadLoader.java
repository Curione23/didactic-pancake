package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerHeadLoader {
    private static final java.util.concurrent.ExecutorService EXECUTOR = null;

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader.EXECUTOR = r0
            return
    }

    private PlayerHeadLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void downloadSkinQuietly(java.lang.String r6, java.io.File r7) {
            r0 = 0
            java.lang.String r6 = ca.dnamobile.javalauncher.skin.AccountSkinCache.normalizeSkinUrl(r6)     // Catch: java.lang.Throwable -> Lab
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lab
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lab
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> Lab
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Lab
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> Laa
            r6.setReadTimeout(r0)     // Catch: java.lang.Throwable -> Laa
            r0 = 1
            r6.setUseCaches(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher"
            r6.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> Laa
            int r0 = r6.getResponseCode()     // Catch: java.lang.Throwable -> Laa
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto La4
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto L31
            goto La4
        L31:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Laa
            java.io.File r1 = r7.getParentFile()     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r2.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r7.getName()     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = ".tmp"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Laa
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> Laa
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L98
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L98
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L8e
        L5e:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            if (r4 == r5) goto L6a
            r5 = 0
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L8e
            goto L5e
        L6a:
            r2.close()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.lang.Throwable -> Laa
        L72:
            boolean r1 = ca.dnamobile.javalauncher.skin.CustomSkinStore.isSkinValid(r0)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L85
            boolean r1 = r7.exists()     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L81
            r7.delete()     // Catch: java.lang.Throwable -> Laa
        L81:
            r0.renameTo(r7)     // Catch: java.lang.Throwable -> Laa
            goto L88
        L85:
            r0.delete()     // Catch: java.lang.Throwable -> Laa
        L88:
            if (r6 == 0) goto Lb0
            r6.disconnect()
            goto Lb0
        L8e:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r7     // Catch: java.lang.Throwable -> L98
        L98:
            r7 = move-exception
            if (r1 == 0) goto La3
            r1.close()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> Laa
        La3:
            throw r7     // Catch: java.lang.Throwable -> Laa
        La4:
            if (r6 == 0) goto La9
            r6.disconnect()
        La9:
            return
        Laa:
            r0 = r6
        Lab:
            if (r0 == 0) goto Lb0
            r0.disconnect()
        Lb0:
            return
    }

    private static java.io.File getCachedSkinFile(android.content.Context r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r1 = "player_skins"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L14
            r0.mkdirs()
        L14:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = sha1(r3)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = ".png"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3)
            return r2
    }

    static /* synthetic */ void lambda$loadInto$0(android.graphics.Bitmap r0, android.widget.ImageView r1) {
            if (r0 == 0) goto L6
            r1.setImageBitmap(r0)
            goto Lb
        L6:
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r1.setImageResource(r0)
        Lb:
            return
    }

    static /* synthetic */ void lambda$loadInto$1(java.io.File r1, java.io.File r2, java.io.File r3, java.lang.String r4, android.content.Context r5, android.widget.ImageView r6) {
            if (r1 == 0) goto Ld
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Ld
            android.graphics.Bitmap r1 = loadHeadFromSkinFile(r1)
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L1c
            if (r2 == 0) goto L1c
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L1c
            android.graphics.Bitmap r1 = loadHeadFromSkinFile(r2)
        L1c:
            if (r1 != 0) goto L2a
            if (r3 == 0) goto L2a
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L2a
            android.graphics.Bitmap r1 = loadHeadFromSkinFile(r3)
        L2a:
            if (r1 != 0) goto L49
            int r2 = r4.length()
            if (r2 <= 0) goto L49
            java.io.File r2 = getCachedSkinFile(r5, r4)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L3f
            downloadSkinQuietly(r4, r2)
        L3f:
            boolean r3 = r2.exists()
            if (r3 == 0) goto L49
            android.graphics.Bitmap r1 = loadHeadFromSkinFile(r2)
        L49:
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.skin.PlayerHeadLoader$$ExternalSyntheticLambda1
            r2.<init>(r1, r6)
            r6.post(r2)
            return
    }

    public static android.graphics.Bitmap loadHeadFromSkinFile(java.io.File r8) {
            java.lang.String r8 = r8.getAbsolutePath()
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8)
            if (r8 == 0) goto L60
            int r0 = r8.getWidth()
            r1 = 64
            if (r0 < r1) goto L60
            int r0 = r8.getHeight()
            r1 = 32
            if (r0 >= r1) goto L1b
            goto L60
        L1b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = 8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 7
            r3.<init>(r4)
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r8, r1, r1, r1, r1)
            r5 = 0
            r2.drawBitmap(r4, r5, r5, r3)
            int r6 = r8.getWidth()
            r7 = 48
            if (r6 < r7) goto L52
            int r6 = r8.getHeight()
            r7 = 16
            if (r6 < r7) goto L52
            r6 = 40
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r6, r1, r1, r1)
            r2.drawBitmap(r8, r5, r5, r3)
            r8.recycle()
        L52:
            r4.recycle()
            r8 = 0
            r1 = 128(0x80, float:1.8E-43)
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r1, r8)
            r0.recycle()
            return r8
        L60:
            r8 = 0
            return r8
    }

    public static void loadInto(android.content.Context r8, android.widget.ImageView r9, ca.dnamobile.javalauncher.data.AccountStore.Account r10, ca.dnamobile.javalauncher.skin.CustomSkinStore r11) {
            int r0 = ca.dnamobile.javalauncher.R.drawable.ic_player_head_placeholder
            r9.setImageResource(r0)
            android.content.Context r6 = r8.getApplicationContext()
            java.io.File r2 = resolveActiveOfflineSkin(r10)
            if (r2 != 0) goto L1c
            if (r11 == 0) goto L1c
            boolean r8 = r11.isEnabled()
            if (r8 == 0) goto L1c
            java.io.File r8 = r11.getSkinFile()
            goto L1d
        L1c:
            r8 = 0
        L1d:
            r3 = r8
            if (r10 == 0) goto L27
            java.lang.String r8 = r10.skinUrl
            java.lang.String r8 = ca.dnamobile.javalauncher.skin.AccountSkinCache.normalizeSkinUrl(r8)
            goto L29
        L27:
            java.lang.String r8 = ""
        L29:
            r5 = r8
            java.io.File r4 = ca.dnamobile.javalauncher.skin.AccountSkinCache.getCachedSkinFileIfPresent(r6, r10)
            java.util.concurrent.ExecutorService r8 = ca.dnamobile.javalauncher.skin.PlayerHeadLoader.EXECUTOR
            ca.dnamobile.javalauncher.skin.PlayerHeadLoader$$ExternalSyntheticLambda0 r10 = new ca.dnamobile.javalauncher.skin.PlayerHeadLoader$$ExternalSyntheticLambda0
            r1 = r10
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.execute(r10)
            return
    }

    private static java.io.File resolveActiveOfflineSkin(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            r0 = 0
            if (r2 == 0) goto L28
            boolean r1 = r2.isOfflineAccount()
            if (r1 == 0) goto L28
            java.lang.String r1 = r2.offlineSkinPath
            if (r1 == 0) goto L28
            java.lang.String r1 = r2.offlineSkinPath
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            goto L28
        L1a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r2.offlineSkinPath
            r1.<init>(r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L28
            r0 = r1
        L28:
            return r0
    }

    private static java.lang.String sha1(java.lang.String r6) {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r6.getBytes(r1)     // Catch: java.lang.Throwable -> L34
            byte[] r0 = r0.digest(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            int r2 = r0.length     // Catch: java.lang.Throwable -> L34
            r3 = 0
        L17:
            if (r3 >= r2) goto L2f
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "%02x"
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch: java.lang.Throwable -> L34
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 1
            goto L17
        L2f:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L34
            return r6
        L34:
            int r6 = r6.hashCode()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            return r6
    }
}
