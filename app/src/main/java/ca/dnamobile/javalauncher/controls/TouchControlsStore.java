package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchControlsStore {
    private static final java.lang.String DEFAULT_ASSET = "touch_controls/droidbridge_default.json";
    private static final java.lang.String[] DEFAULT_ASSET_CANDIDATES = null;
    private static final java.lang.String DEFAULT_FILE = "droidbridge_default.json";
    private static final java.lang.String TAG = "TouchControlsStore";

    static {
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "touch_controls/droidbridge_default.json"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "touch_controls/default.json"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "touch_controls/default_touch_controls.json"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "droidbridge_default.json"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "default.json"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "default_touch_controls.json"
            r0[r1] = r2
            ca.dnamobile.javalauncher.controls.TouchControlsStore.DEFAULT_ASSET_CANDIDATES = r0
            return
    }

    private TouchControlsStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File backupFileFor(java.io.File r3) {
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "."
            r0.<init>(r1)
        Le:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = ".bak"
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.<init>(r0, r3)
            return r1
    }

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    private static void copyFile(java.io.File r2, java.io.File r3) throws java.lang.Exception {
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create touch controls directory: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55
            r1 = 0
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            copy(r0, r2)     // Catch: java.lang.Throwable -> L4b
            r2.flush()     // Catch: java.lang.Throwable -> L4b
            java.io.FileDescriptor r3 = r2.getFD()     // Catch: java.lang.Throwable -> L44
            r3.sync()     // Catch: java.lang.Throwable -> L44
        L44:
            r2.close()     // Catch: java.lang.Throwable -> L55
            r0.close()
            return
        L4b:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L55
        L54:
            throw r3     // Catch: java.lang.Throwable -> L55
        L55:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r3 = move-exception
            r2.addSuppressed(r3)
        L5e:
            throw r2
    }

    public static java.io.File ensureDefaultLayout(android.content.Context r6) {
            java.lang.String r0 = "TouchControlsStore"
            java.io.File r1 = getDefaultLayoutFile(r6)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L16
            long r2 = r1.length()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L37
        L16:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r6 = loadBundledDefaultLayout(r6)     // Catch: java.lang.Throwable -> L23
            saveLayout(r1, r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = "Created default touch controls from bundled asset: touch_controls/droidbridge_default.json"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)     // Catch: java.lang.Throwable -> L23
            goto L37
        L23:
            r6 = move-exception
            java.lang.String r2 = "Bundled default_touch.json missing or invalid. Falling back to emergency in-code layout."
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r6)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r6 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.defaultLayout()     // Catch: java.lang.Throwable -> L31
            saveLayout(r1, r6)     // Catch: java.lang.Throwable -> L31
            goto L37
        L31:
            r6 = move-exception
            java.lang.String r2 = "Unable to create fallback default touch controls"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r6)
        L37:
            return r1
    }

    public static java.io.File getControlsDir(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "touch_controls"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L14
            r0.mkdirs()
        L14:
            return r0
    }

    public static java.io.File getDefaultLayoutFile(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = getControlsDir(r2)
            java.lang.String r1 = "droidbridge_default.json"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.io.File getSelectedLayoutFile(android.content.Context r3) {
            java.io.File r0 = ensureDefaultLayout(r3)
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getSelectedLayoutPath(r3)
            if (r1 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.isFile()
            if (r1 == 0) goto L16
            return r2
        L16:
            java.lang.String r1 = r0.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r3, r1)
            return r0
    }

    public static java.util.List<java.io.File> listLayouts(android.content.Context r6) {
            ensureDefaultLayout(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r6 = getControlsDir(r6)
            java.io.File[] r6 = r6.listFiles()
            if (r6 == 0) goto L34
            int r1 = r6.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L34
            r3 = r6[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L31
            java.lang.String r4 = r3.getName()
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = ".json"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L31
            r0.add(r3)
        L31:
            int r2 = r2 + 1
            goto L14
        L34:
            return r0
    }

    private static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData loadBundledDefaultLayout(android.content.Context r9) throws java.lang.Exception {
            java.lang.String[] r0 = ca.dnamobile.javalauncher.controls.TouchControlsStore.DEFAULT_ASSET_CANDIDATES
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L60
            r2 = r0[r3]
            android.content.res.AssetManager r4 = r9.getAssets()     // Catch: java.lang.Throwable -> L5c
            java.io.InputStream r4 = r4.open(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = readStreamText(r4)     // Catch: java.lang.Throwable -> L50
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L50
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r5 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.fromJson(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r5.name     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L2e
            java.lang.String r6 = r5.name     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L50
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L32
        L2e:
            java.lang.String r6 = "Default Touch Controls"
            r5.name = r6     // Catch: java.lang.Throwable -> L50
        L32:
            java.lang.String r6 = "TouchControlsStore"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r7.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = "Loaded bundled default touch controls from asset: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = r7.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L50
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r2)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L4f
            r4.close()     // Catch: java.lang.Throwable -> L5c
        L4f:
            return r5
        L50:
            r2 = move-exception
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r2     // Catch: java.lang.Throwable -> L5c
        L5c:
            r2 = move-exception
            int r3 = r3 + 1
            goto L5
        L60:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No bundled default touch layout found. Expected touch_controls/droidbridge_default.json"
            r9.<init>(r0, r2)
            throw r9
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData loadLayout(java.io.File r4) {
            java.lang.String r0 = "Recovered touch layout from backup: "
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r4 = readLayoutFromFile(r4)     // Catch: java.lang.Throwable -> L7
            return r4
        L7:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to read touch layout "
            r2.<init>(r3)
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TouchControlsStore"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r2, r1)
            java.io.File r4 = backupFileFor(r4)
            boolean r1 = r4.isFile()
            if (r1 == 0) goto L5a
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = readLayoutFromFile(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r0)     // Catch: java.lang.Throwable -> L43
            return r1
        L43:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read backup touch layout "
            r1.<init>(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r4, r0)
        L5a:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r4 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.defaultLayout()
            return r4
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData loadSelectedLayout(android.content.Context r0) {
            java.io.File r0 = getSelectedLayoutFile(r0)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = loadLayout(r0)
            return r0
    }

    private static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData readLayoutFromFile(java.io.File r1) throws java.lang.Exception {
            java.lang.String r1 = readText(r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.fromJson(r0)
            return r1
    }

    private static java.lang.String readStreamText(java.io.InputStream r6) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L9:
            int r2 = r6.read(r0)
            r3 = -1
            if (r2 == r3) goto L1c
            java.lang.String r3 = new java.lang.String
            r4 = 0
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r4, r2, r5)
            r1.append(r3)
            goto L9
        L1c:
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static java.lang.String readText(java.io.File r1) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.lang.String r1 = readStreamText(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r1
        Ld:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r1.addSuppressed(r0)
        L16:
            throw r1
    }

    private static java.lang.String readUriText(android.content.Context r1, android.net.Uri r2) throws java.lang.Exception {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.io.InputStream r1 = r1.openInputStream(r2)
            if (r1 == 0) goto L16
            java.lang.String r2 = readStreamText(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L13
            r1.close()
        L13:
            return r2
        L14:
            r2 = move-exception
            goto L1e
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "Unable to open selected controls file."
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L14
        L1e:
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r1 = move-exception
            r2.addSuppressed(r1)
        L28:
            throw r2
    }

    private static java.lang.String sanitizeFileName(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "[^A-Za-z0-9._-]+"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "_+"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    public static java.io.File saveImportedLayout(android.content.Context r3, android.net.Uri r4) throws java.lang.Exception {
            java.lang.String r4 = readUriText(r3, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r4)
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r4 = ca.dnamobile.javalauncher.controls.TouchControlsLayoutData.fromJson(r0)
            java.lang.String r0 = r4.name
            java.lang.String r0 = sanitizeFileName(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            java.lang.String r0 = "imported_controls"
        L1b:
            java.io.File r1 = getControlsDir(r3)
            java.lang.String r2 = ".json"
            java.io.File r0 = uniqueFile(r1, r0, r2)
            saveLayout(r0, r4)
            java.lang.String r4 = r0.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r3, r4)
            return r0
    }

    public static void saveLayout(java.io.File r1, ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r2) throws java.lang.Exception {
            org.json.JSONObject r2 = r2.toJson()
            r0 = 2
            java.lang.String r2 = r2.toString(r0)
            writeTextAtomically(r1, r2)
            return
    }

    private static java.io.File uniqueFile(java.io.File r4, java.lang.String r5, java.lang.String r6) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            r1 = 2
        L17:
            boolean r2 = r0.exists()
            if (r2 == 0) goto L40
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "_"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.<init>(r4, r2)
            int r1 = r1 + 1
            goto L17
        L40:
            return r0
    }

    private static void writeText(java.io.File r2, java.lang.String r3) throws java.lang.Exception {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 0
            r0.<init>(r2, r1)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1d
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L1d
            r0.write(r2)     // Catch: java.lang.Throwable -> L1d
            r0.flush()     // Catch: java.lang.Throwable -> L1d
            java.io.FileDescriptor r2 = r0.getFD()     // Catch: java.lang.Throwable -> L19
            r2.sync()     // Catch: java.lang.Throwable -> L19
        L19:
            r0.close()
            return
        L1d:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r3 = move-exception
            r2.addSuppressed(r3)
        L26:
            throw r2
    }

    private static void writeTextAtomically(java.io.File r4, java.lang.String r5) throws java.lang.Exception {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create touch controls directory: "
            r5.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            if (r0 == 0) goto L2f
            goto L36
        L2f:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "."
            r0.<init>(r1)
        L36:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".tmp"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            java.io.File r0 = backupFileFor(r4)
            writeText(r1, r5)
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L7c
            copyFile(r4, r0)     // Catch: java.lang.Throwable -> L63
            goto L7c
        L63:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to update touch layout backup "
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TouchControlsStore"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r0, r5)
        L7c:
            boolean r5 = r4.exists()
            if (r5 == 0) goto L8f
            boolean r5 = r4.delete()
            if (r5 != 0) goto L8f
            copyFile(r1, r4)
            r1.delete()
            return
        L8f:
            boolean r5 = r1.renameTo(r4)
            if (r5 != 0) goto L9b
            copyFile(r1, r4)
            r1.delete()
        L9b:
            return
    }
}
