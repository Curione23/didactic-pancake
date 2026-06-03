package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class AccountSkinCache {
    private static final java.lang.String DIR_NAME = "account_skins";
    private static final java.lang.String TAG = "AccountSkinCache";

    private AccountSkinCache() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean cacheMicrosoftSkin(android.content.Context r10, ca.dnamobile.javalauncher.data.AccountStore.Account r11) {
            java.lang.String r0 = "AccountSkinCache"
            java.lang.String r1 = "Skin download failed with HTTP "
            r2 = 0
            if (r11 == 0) goto L13b
            java.lang.String r3 = r11.minecraftUuid
            boolean r3 = isBlank(r3)
            if (r3 != 0) goto L13b
            java.lang.String r3 = r11.skinUrl
            boolean r3 = isBlank(r3)
            if (r3 == 0) goto L19
            goto L13b
        L19:
            java.lang.String r3 = r11.minecraftUuid
            java.io.File r10 = getSkinFile(r10, r3)
            java.io.File r3 = new java.io.File
            java.io.File r4 = r10.getParentFile()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r10.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ".tmp"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            r4 = 0
            java.lang.String r5 = r11.skinUrl     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = normalizeSkinUrl(r5)     // Catch: java.lang.Throwable -> L125
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> L125
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L125
            java.net.URLConnection r5 = r6.openConnection()     // Catch: java.lang.Throwable -> L125
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L125
            r4 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L122
            r5.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L122
            r4 = 1
            r5.setUseCaches(r4)     // Catch: java.lang.Throwable -> L122
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = "JavaLauncher"
            r5.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L122
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L122
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 < r7) goto L100
            r7 = 300(0x12c, float:4.2E-43)
            if (r6 < r7) goto L72
            goto L100
        L72:
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Throwable -> L122
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf4
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lf4
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> Lea
        L7f:
            int r8 = r1.read(r7)     // Catch: java.lang.Throwable -> Lea
            r9 = -1
            if (r8 == r9) goto L8a
            r6.write(r7, r2, r8)     // Catch: java.lang.Throwable -> Lea
            goto L7f
        L8a:
            r6.close()     // Catch: java.lang.Throwable -> Lf4
            if (r1 == 0) goto L92
            r1.close()     // Catch: java.lang.Throwable -> L122
        L92:
            boolean r1 = ca.dnamobile.javalauncher.skin.CustomSkinStore.isSkinValid(r3)     // Catch: java.lang.Throwable -> L122
            if (r1 != 0) goto La6
            r3.delete()     // Catch: java.lang.Throwable -> L122
            java.lang.String r10 = "Downloaded Microsoft skin was not a valid 64x64/64x32 skin."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto La5
            r5.disconnect()
        La5:
            return r2
        La6:
            boolean r1 = r10.exists()     // Catch: java.lang.Throwable -> L122
            if (r1 == 0) goto Laf
            r10.delete()     // Catch: java.lang.Throwable -> L122
        Laf:
            boolean r1 = r3.renameTo(r10)     // Catch: java.lang.Throwable -> L122
            if (r1 != 0) goto Lbe
            r3.delete()     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto Lbd
            r5.disconnect()
        Lbd:
            return r2
        Lbe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L122
            r1.<init>()     // Catch: java.lang.Throwable -> L122
            java.lang.String r6 = "Cached Microsoft skin for "
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L122
            java.lang.String r11 = r11.minecraftName     // Catch: java.lang.Throwable -> L122
            java.lang.StringBuilder r11 = r1.append(r11)     // Catch: java.lang.Throwable -> L122
            java.lang.String r1 = " at "
            java.lang.StringBuilder r11 = r11.append(r1)     // Catch: java.lang.Throwable -> L122
            java.lang.String r10 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L122
            java.lang.StringBuilder r10 = r11.append(r10)     // Catch: java.lang.Throwable -> L122
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L122
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto Le9
            r5.disconnect()
        Le9:
            return r4
        Lea:
            r10 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Lef
            goto Lf3
        Lef:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> Lf4
        Lf3:
            throw r10     // Catch: java.lang.Throwable -> Lf4
        Lf4:
            r10 = move-exception
            if (r1 == 0) goto Lff
            r1.close()     // Catch: java.lang.Throwable -> Lfb
            goto Lff
        Lfb:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> L122
        Lff:
            throw r10     // Catch: java.lang.Throwable -> L122
        L100:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L122
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L122
            java.lang.StringBuilder r10 = r10.append(r6)     // Catch: java.lang.Throwable -> L122
            java.lang.String r1 = " for "
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L122
            java.lang.String r11 = r11.minecraftName     // Catch: java.lang.Throwable -> L122
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L122
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L122
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto L121
            r5.disconnect()
        L121:
            return r2
        L122:
            r10 = move-exception
            r4 = r5
            goto L126
        L125:
            r10 = move-exception
        L126:
            java.lang.String r11 = "Unable to cache Microsoft skin"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r11, r10)     // Catch: java.lang.Throwable -> L134
            r3.delete()     // Catch: java.lang.Throwable -> L134
            if (r4 == 0) goto L133
            r4.disconnect()
        L133:
            return r2
        L134:
            r10 = move-exception
            if (r4 == 0) goto L13a
            r4.disconnect()
        L13a:
            throw r10
        L13b:
            return r2
    }

    public static void cacheMicrosoftSkinAsync(android.content.Context r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            if (r3 == 0) goto L26
            java.lang.String r0 = r3.minecraftUuid
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r3.skinUrl
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto L13
            goto L26
        L13:
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.skin.AccountSkinCache$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.skin.AccountSkinCache$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            java.lang.String r2 = "JavaLauncherMicrosoftSkinCache"
            r0.<init>(r1, r2)
            r0.start()
        L26:
            return
    }

    public static java.io.File getCachedSkinFileIfPresent(android.content.Context r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            r0 = 0
            if (r3 == 0) goto L19
            java.lang.String r1 = r3.minecraftUuid
            boolean r1 = isBlank(r1)
            if (r1 == 0) goto Lc
            goto L19
        Lc:
            java.lang.String r3 = r3.minecraftUuid
            java.io.File r2 = getSkinFile(r2, r3)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L19
            r0 = r2
        L19:
            return r0
    }

    public static java.io.File getSkinFile(android.content.Context r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            android.content.Context r4 = r4.getApplicationContext()
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r1 = "account_skins"
            r0.<init>(r4, r1)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L18
            r0.mkdirs()
        L18:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "-"
            java.lang.String r3 = ""
            java.lang.String r5 = r5.replace(r2, r3)
            java.lang.String r5 = r5.toLowerCase()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = ".png"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r0, r5)
            return r4
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    static /* synthetic */ void lambda$cacheMicrosoftSkinAsync$0(android.content.Context r0, ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            cacheMicrosoftSkin(r0, r1)
            return
    }

    public static java.lang.String normalizeSkinUrl(java.lang.String r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "http://textures.minecraft.net/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://textures.minecraft.net/"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L28:
            return r3
    }
}
