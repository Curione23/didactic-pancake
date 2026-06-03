package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public final class CustomSkinStore {
    private static final java.lang.String KEY_ENABLED = "enabled";
    private static final java.lang.String KEY_MODEL = "model";
    private static final java.lang.String PREFS = "java_launcher_custom_skin";
    private static final java.lang.String SKIN_DIR = "custom_skins";
    private static final java.lang.String SKIN_FILE = "selected_skin.png";
    private final android.content.Context context;
    private final android.content.SharedPreferences preferences;

    public CustomSkinStore(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.context = r3
            java.lang.String r0 = "java_launcher_custom_skin"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.preferences = r3
            return
    }

    private static void copyFile(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L21
        Le:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L21
            r2 = -1
            if (r1 == r2) goto L1a
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L21
            goto Le
        L1a:
            r3.close()     // Catch: java.lang.Throwable -> L2b
            r0.close()
            return
        L21:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L2b
        L2a:
            throw r4     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r3.addSuppressed(r4)
        L34:
            throw r3
    }

    private void copyUriToFile(android.net.Uri r4, java.io.File r5) throws java.io.IOException {
            r3 = this;
            android.content.Context r0 = r3.context
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r4 = r0.openInputStream(r4)
            if (r4 == 0) goto L36
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L34
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2a
        L15:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L2a
            r2 = -1
            if (r1 == r2) goto L21
            r2 = 0
            r0.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L2a
            goto L15
        L21:
            r0.close()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L29
            r4.close()
        L29:
            return
        L2a:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L34
        L33:
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            goto L3e
        L36:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "Could not open selected skin."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r5     // Catch: java.lang.Throwable -> L34
        L3e:
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r4 = move-exception
            r5.addSuppressed(r4)
        L48:
            throw r5
    }

    private static ca.dnamobile.javalauncher.skin.SkinModelType detectSkinModel(android.graphics.Bitmap r4) {
            int r0 = r4.getWidth()
            r1 = 64
            if (r0 < r1) goto L22
            int r0 = r4.getHeight()
            if (r0 >= r1) goto Lf
            goto L22
        Lf:
            r0 = 2
            r1 = 12
            r2 = 54
            r3 = 20
            boolean r4 = isTransparent(r4, r2, r3, r0, r1)
            if (r4 == 0) goto L1f
            ca.dnamobile.javalauncher.skin.SkinModelType r4 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            goto L21
        L1f:
            ca.dnamobile.javalauncher.skin.SkinModelType r4 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
        L21:
            return r4
        L22:
            ca.dnamobile.javalauncher.skin.SkinModelType r4 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            return r4
    }

    public static java.lang.String getOfflineUuidWithSkinModel(java.lang.String r4, ca.dnamobile.javalauncher.skin.SkinModelType r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflinePlayer:"
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r0)
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
            if (r5 != r0) goto L22
            java.lang.String r4 = r4.toString()
            return r4
        L22:
            int r0 = r4.hashCode()
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            ca.dnamobile.javalauncher.skin.SkinModelType r3 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            if (r5 != r3) goto L34
            r5 = r1
            goto L35
        L34:
            r5 = r2
        L35:
            if (r0 != r5) goto L3c
            java.lang.String r4 = r4.toString()
            return r4
        L3c:
            java.lang.String r5 = r4.toString()
            int r0 = r5.length()
            int r0 = r0 - r1
            char r0 = r5.charAt(r0)
            r3 = 16
            int r0 = java.lang.Character.digit(r0, r3)
            r3 = -1
            if (r0 != r3) goto L57
            java.lang.String r4 = r4.toString()
            return r4
        L57:
            r4 = r0 ^ 1
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            char r4 = r4.charAt(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r5.length()
            int r3 = r3 - r1
            java.lang.String r5 = r5.substring(r2, r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.io.File getSkinDirectory() {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.context
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "custom_skins"
            r0.<init>(r1, r2)
            return r0
    }

    public static ca.dnamobile.javalauncher.skin.SkinModelType getSkinModel(java.io.File r2) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r0.inPreferredConfig = r1
            java.lang.String r2 = r2.getAbsolutePath()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2, r0)
            if (r2 != 0) goto L16
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            return r2
        L16:
            int r0 = r2.getHeight()
            r1 = 32
            if (r0 != r1) goto L21
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            return r2
        L21:
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = detectSkinModel(r2)
            return r2
    }

    public static boolean isSkinValid(java.io.File r3) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.lang.String r3 = r3.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r3, r0)
            int r3 = r0.outWidth
            r2 = 64
            if (r3 != r2) goto L19
            int r3 = r0.outHeight
            if (r3 == r2) goto L25
        L19:
            int r3 = r0.outWidth
            if (r3 != r2) goto L24
            int r3 = r0.outHeight
            r0 = 32
            if (r3 != r0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
    }

    private static boolean isTransparent(android.graphics.Bitmap r3, int r4, int r5, int r6, int r7) {
            r0 = r4
        L1:
            int r1 = r4 + r6
            if (r0 >= r1) goto L1c
            r1 = r5
        L6:
            int r2 = r5 + r7
            if (r1 >= r2) goto L19
            int r2 = r3.getPixel(r0, r1)
            int r2 = r2 >>> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L16
            r3 = 0
            return r3
        L16:
            int r1 = r1 + 1
            goto L6
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            r3 = 1
            return r3
    }

    public ca.dnamobile.javalauncher.skin.OfflineSkinProfile buildOfflineProfile(java.lang.String r5) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto Lb
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = r4.getSkinModel()
            goto Ld
        Lb:
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
        Ld:
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r2 = new ca.dnamobile.javalauncher.skin.OfflineSkinProfile
            java.lang.String r5 = getOfflineUuidWithSkinModel(r5, r1)
            if (r0 == 0) goto L1a
            java.io.File r3 = r4.getSkinFile()
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r2.<init>(r5, r3, r1, r0)
            return r2
    }

    public void clear() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            java.io.File r0 = r2.getSkinFile()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1a
            r0.delete()
        L1a:
            return
    }

    public java.io.File getSkinFile() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getSkinDirectory()
            java.lang.String r2 = "selected_skin.png"
            r0.<init>(r1, r2)
            return r0
    }

    public ca.dnamobile.javalauncher.skin.SkinModelType getSkinModel() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.preferences
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            java.lang.String r1 = r1.id
            java.lang.String r2 = "model"
            java.lang.String r0 = r0.getString(r2, r1)
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = ca.dnamobile.javalauncher.skin.SkinModelType.fromId(r0)
            return r0
    }

    public ca.dnamobile.javalauncher.skin.SkinModelType importSkin(android.net.Uri r5) throws java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.getSkinDirectory()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2a
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not create skin folder: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L2a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "selected_skin.png.tmp"
            r1.<init>(r0, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "selected_skin.png"
            r2.<init>(r0, r3)
            r4.copyUriToFile(r5, r1)
            boolean r5 = isSkinValid(r1)
            if (r5 == 0) goto L7f
            ca.dnamobile.javalauncher.skin.SkinModelType r5 = getSkinModel(r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L5a
            boolean r0 = r2.delete()
            if (r0 == 0) goto L52
            goto L5a
        L52:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Could not replace old skin."
            r5.<init>(r0)
            throw r5
        L5a:
            boolean r0 = r1.renameTo(r2)
            if (r0 != 0) goto L66
            copyFile(r1, r2)
            r1.delete()
        L66:
            android.content.SharedPreferences r0 = r4.preferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enabled"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            java.lang.String r1 = "model"
            java.lang.String r2 = r5.id
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
            return r5
        L7f:
            r1.delete()
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Invalid skin. Use a 64x64 or 64x32 PNG skin."
            r5.<init>(r0)
            throw r5
    }

    public boolean isEnabled() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.preferences
            java.lang.String r1 = "enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L16
            java.io.File r0 = r3.getSkinFile()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L16
            r2 = 1
        L16:
            return r2
    }
}
