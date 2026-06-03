package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class StorageLocationStore {
    public static final java.lang.String DEFAULT_LOCATION_ID = "default";
    private static final java.lang.String JSON_ID = "id";
    private static final java.lang.String JSON_NAME = "name";
    private static final java.lang.String JSON_URI = "uri";
    private static final java.lang.String KEY_LOCATIONS = "locations_json";
    private static final java.lang.String KEY_SELECTED_LOCATION_ID = "selected_location_id";
    private static final java.lang.String METADATA_RESTORE_MARKER = ".scoped_storage_metadata_loaded";
    private static final java.lang.String PREFS_NAME = "storage_locations";
    private static final java.lang.String TAG = "StorageLocationStore";

    private StorageLocationStore() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addHomeIfMissing(java.util.List<java.io.File> r1, java.util.Set<java.lang.String> r2, java.io.File r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getAbsolutePath()
            boolean r2 = r2.add(r0)
            if (r2 == 0) goto L10
            r1.add(r3)
        L10:
            return
    }

    public static ca.dnamobile.javalauncher.storage.StorageLocation addTreeUri(android.content.Context r10, android.net.Uri r11) {
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.String r4 = r11.toString()
            java.lang.String r1 = buildLocationId(r4)
            java.io.File r0 = resolveTreeUriToLauncherHome(r10, r11)
            java.lang.String r2 = buildDisplayName(r10, r11, r0)
            org.json.JSONArray r11 = readLocationArray(r10)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r5 = 0
            r6 = r5
        L1f:
            int r7 = r11.length()
            if (r5 >= r7) goto L46
            org.json.JSONObject r7 = r11.getJSONObject(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "id"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.optString(r8, r9)     // Catch: java.lang.Throwable -> L43
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L40
            org.json.JSONObject r7 = toJson(r1, r2, r4)     // Catch: java.lang.Throwable -> L43
            r3.put(r7)     // Catch: java.lang.Throwable -> L43
            r6 = 1
            goto L43
        L40:
            r3.put(r7)     // Catch: java.lang.Throwable -> L43
        L43:
            int r5 = r5 + 1
            goto L1f
        L46:
            if (r6 != 0) goto L4f
            org.json.JSONObject r11 = toJson(r1, r2, r4)
            r3.put(r11)
        L4f:
            android.content.SharedPreferences r11 = getPrefs(r10)
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.String r5 = "locations_json"
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences$Editor r11 = r11.putString(r5, r3)
            r11.apply()
            java.util.List r11 = getLocations(r10)
            java.util.Iterator r11 = r11.iterator()
        L6c:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r11.next()
            ca.dnamobile.javalauncher.storage.StorageLocation r3 = (ca.dnamobile.javalauncher.storage.StorageLocation) r3
            java.lang.String r5 = r3.getId()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L6c
            return r3
        L83:
            if (r0 == 0) goto L8d
            boolean r11 = canUseLauncherHomeDirectly(r0)
            if (r11 == 0) goto L8d
            r10 = r0
            goto L91
        L8d:
            java.io.File r10 = getScopedMirrorLauncherHome(r10, r1)
        L91:
            ca.dnamobile.javalauncher.storage.StorageLocation r11 = new ca.dnamobile.javalauncher.storage.StorageLocation
            java.lang.String r3 = ".minecraft"
            if (r0 == 0) goto La2
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r3)
            java.lang.String r0 = r5.getAbsolutePath()
            r5 = r0
            goto La3
        La2:
            r5 = r4
        La3:
            java.lang.String r6 = r10.getAbsolutePath()
            java.io.File r0 = new java.io.File
            r0.<init>(r10, r3)
            java.lang.String r10 = r0.getAbsolutePath()
            r7 = 0
            r8 = 1
            r0 = r11
            r3 = r5
            r5 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
    }

    private static java.lang.String buildDisplayName(android.content.Context r2, android.net.Uri r3, java.io.File r4) {
            if (r4 == 0) goto L13
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L13
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            return r4
        L13:
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 == 0) goto L66
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L24
            goto L66
        L24:
            r2 = 58
            int r4 = r3.indexOf(r2)
            r0 = 47
            if (r4 < 0) goto L61
            int r4 = r4 + 1
            int r1 = r3.length()
            if (r4 >= r1) goto L61
            java.lang.String r4 = r3.substring(r4)
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L61
            int r2 = r4.lastIndexOf(r0)
            r3 = 92
            int r3 = r4.lastIndexOf(r3)
            int r2 = java.lang.Math.max(r2, r3)
            if (r2 < 0) goto L60
            int r2 = r2 + 1
            int r3 = r4.length()
            if (r2 >= r3) goto L60
            java.lang.String r4 = r4.substring(r2)
        L60:
            return r4
        L61:
            java.lang.String r2 = r3.replace(r2, r0)
            return r2
        L66:
            int r3 = ca.dnamobile.javalauncher.R.string.storage_scoped_name
            java.lang.String r2 = r2.getString(r3)
            return r2
    }

    private static java.lang.String buildLocationId(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "tree:"
            r0.<init>(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static boolean canUseLauncherHomeDirectly(java.io.File r6) {
            java.lang.String r0 = "StorageLocationStore"
            java.lang.String r1 = "Unable to delete direct storage write test: "
            r2 = 0
            boolean r3 = r6.isDirectory()     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto Lc
            return r2
        Lc:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = ".minecraft"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L66
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L66
            if (r4 != 0) goto L26
            boolean r4 = r3.mkdirs()     // Catch: java.lang.Throwable -> L66
            if (r4 != 0) goto L26
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L66
            if (r4 != 0) goto L26
            return r2
        L26:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = ".java_launcher_write_test"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L66
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L66
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L66
            r5 = 74
            r3.write(r5)     // Catch: java.lang.Throwable -> L5c
            r3.close()     // Catch: java.lang.Throwable -> L66
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L5a
            boolean r3 = r4.delete()     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L66
        L5a:
            r6 = 1
            return r6
        L5c:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> L66
        L65:
            throw r1     // Catch: java.lang.Throwable -> L66
        L66:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Selected folder is not writable through File API, using SAF mirror fallback: "
            r3.<init>(r4)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r3 = " because "
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)
            return r2
    }

    public static boolean deleteFromScopedStorageIfNeeded(android.content.Context r6, java.io.File r7) throws java.lang.Exception {
            android.content.Context r6 = r6.getApplicationContext()
            java.io.File r7 = r7.getCanonicalFile()
            java.util.List r0 = getLocations(r6)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.storage.StorageLocation r1 = (ca.dnamobile.javalauncher.storage.StorageLocation) r1
            boolean r3 = r1.isDefaultLocation()
            if (r3 == 0) goto L24
            goto L10
        L24:
            boolean r3 = isMirrorBackedStorageLocation(r6, r1)
            if (r3 != 0) goto L2b
            goto L10
        L2b:
            java.lang.String r3 = r1.getUriString()
            java.lang.String r1 = r1.getLauncherHomePath()
            if (r3 == 0) goto L10
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L40
            goto L10
        L40:
            if (r1 == 0) goto L10
            java.lang.String r4 = r1.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L4d
            goto L10
        L4d:
            java.lang.String r3 = r3.trim()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.io.File r4 = new java.io.File
            java.lang.String r1 = r1.trim()
            r4.<init>(r1)
            java.io.File r1 = r4.getCanonicalFile()
            boolean r4 = isMinecraftTreeUri(r6, r3)
            if (r4 == 0) goto L73
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ".minecraft"
            r4.<init>(r1, r5)
            java.io.File r1 = r4.getCanonicalFile()
        L73:
            boolean r4 = r7.equals(r1)
            if (r4 != 0) goto L80
            boolean r4 = isChildOf(r1, r7)
            if (r4 != 0) goto L80
            goto L10
        L80:
            java.lang.String r0 = relativePath(r1, r7)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Refusing to delete scoped storage root for local path: "
            r6.<init>(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return r2
        La3:
            boolean r6 = ca.dnamobile.javalauncher.storage.SafMinecraftMirror.deleteRelativePathFromTree(r6, r3, r0)
            return r6
        La8:
            return r2
    }

    public static java.util.List<java.io.File> getAllLauncherHomes(android.content.Context r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List r2 = getLocations(r5)
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.storage.StorageLocation r3 = (ca.dnamobile.javalauncher.storage.StorageLocation) r3
            java.lang.String r3 = r3.getLauncherHomePath()
            if (r3 == 0) goto L12
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L12
            java.io.File r4 = new java.io.File
            java.lang.String r3 = r3.trim()
            r4.<init>(r3)
            addHomeIfMissing(r0, r1, r4)
            goto L12
        L3b:
            java.io.File r2 = getSelectedLauncherHome(r5)
            addHomeIfMissing(r0, r1, r2)
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r5)
            addHomeIfMissing(r0, r1, r5)
            return r0
    }

    public static java.util.List<java.io.File> getAllMinecraftHomes(android.content.Context r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List r5 = getAllLauncherHomes(r5)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ".minecraft"
            r3.<init>(r2, r4)
            java.lang.String r2 = r3.getAbsolutePath()
            boolean r2 = r1.add(r2)
            if (r2 == 0) goto L12
            r0.add(r3)
            goto L12
        L33:
            return r0
    }

    public static java.util.List<ca.dnamobile.javalauncher.storage.StorageLocation> getLocations(android.content.Context r18) {
            java.lang.String r1 = ""
            android.content.Context r2 = r18.getApplicationContext()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r2)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ".minecraft"
            r4.<init>(r0, r5)
            ca.dnamobile.javalauncher.storage.StorageLocation r15 = new ca.dnamobile.javalauncher.storage.StorageLocation
            int r6 = ca.dnamobile.javalauncher.R.string.storage_default_name
            java.lang.String r8 = r2.getString(r6)
            java.lang.String r9 = r4.getAbsolutePath()
            java.lang.String r11 = r0.getAbsolutePath()
            java.lang.String r12 = r4.getAbsolutePath()
            r13 = 1
            r14 = 1
            java.lang.String r7 = "default"
            r10 = 0
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.add(r15)
            org.json.JSONArray r4 = readAndCleanLocationArray(r2)
            r6 = 0
            r7 = r6
        L3c:
            int r0 = r4.length()
            if (r7 >= r0) goto L100
            org.json.JSONObject r0 = r4.getJSONObject(r7)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r8 = "id"
            java.lang.String r10 = r0.optString(r8, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r8 = "name"
            java.lang.String r8 = r0.optString(r8, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r9 = "uri"
            java.lang.String r13 = r0.optString(r9, r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = r10.trim()     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r0 != 0) goto Lfc
            java.lang.String r0 = r13.trim()     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L6e
            goto Lfc
        L6e:
            android.net.Uri r0 = android.net.Uri.parse(r13)     // Catch: java.lang.Throwable -> Le3
            java.io.File r9 = resolveTreeUriToLauncherHome(r2, r0)     // Catch: java.lang.Throwable -> Le3
            if (r9 == 0) goto L7e
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Le3
            r11.<init>(r9, r5)     // Catch: java.lang.Throwable -> Le3
            goto L7f
        L7e:
            r11 = 0
        L7f:
            if (r9 == 0) goto L89
            boolean r12 = canUseLauncherHomeDirectly(r9)     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto L89
            r12 = 1
            goto L8a
        L89:
            r12 = r6
        L8a:
            if (r12 == 0) goto L94
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> Le3
            r14.<init>(r9, r5)     // Catch: java.lang.Throwable -> Le3
            r15 = r14
            r14 = r9
            goto L9d
        L94:
            java.io.File r14 = getScopedMirrorLauncherHome(r2, r10)     // Catch: java.lang.Throwable -> Le3
            java.io.File r15 = new java.io.File     // Catch: java.lang.Throwable -> Le3
            r15.<init>(r14, r5)     // Catch: java.lang.Throwable -> Le3
        L9d:
            if (r11 == 0) goto Lba
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> Le3
            if (r12 != 0) goto Lb8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r12.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r11 = r12.append(r11)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r12 = "\nCompatibility mode: files are staged locally, then copied by Android scoped storage."
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Le3
        Lb8:
            r12 = r11
            goto Lbb
        Lba:
            r12 = r13
        Lbb:
            ca.dnamobile.javalauncher.storage.StorageLocation r11 = new ca.dnamobile.javalauncher.storage.StorageLocation     // Catch: java.lang.Throwable -> Le3
            java.lang.String r16 = r8.trim()     // Catch: java.lang.Throwable -> Le3
            boolean r16 = r16.isEmpty()     // Catch: java.lang.Throwable -> Le3
            if (r16 == 0) goto Lcc
            java.lang.String r0 = buildDisplayName(r2, r0, r9)     // Catch: java.lang.Throwable -> Le3
            goto Lcd
        Lcc:
            r0 = r8
        Lcd:
            java.lang.String r14 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r15 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> Le3
            r16 = 0
            r17 = 1
            r9 = r11
            r8 = r11
            r11 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Le3
            r3.add(r8)     // Catch: java.lang.Throwable -> Le3
            goto Lfc
        Le3:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Skipping broken storage location: "
            r8.<init>(r9)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r0)
        Lfc:
            int r7 = r7 + 1
            goto L3c
        L100:
            return r3
    }

    private static android.content.SharedPreferences getPrefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "storage_locations"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static java.io.File getScopedMirrorLauncherHome(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r4 = r4.replaceAll(r0, r1)
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r3.getApplicationContext()
            java.io.File r3 = r3.getFilesDir()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "scoped_storage_mirrors/"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r3, r4)
            return r0
    }

    public static java.io.File getSelectedLauncherHome(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r2)
            java.lang.String r0 = r0.getLauncherHomePath()
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.trim()
            r2.<init>(r0)
            return r2
        L22:
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r2)
            return r2
    }

    private static java.io.File getSelectedLocalRootForTree(android.content.Context r1, android.net.Uri r2) {
            java.io.File r0 = getSelectedLauncherHome(r1)
            boolean r1 = isMinecraftTreeUri(r1, r2)
            if (r1 == 0) goto L12
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".minecraft"
            r1.<init>(r0, r2)
            r0 = r1
        L12:
            return r0
    }

    public static ca.dnamobile.javalauncher.storage.StorageLocation getSelectedLocation(android.content.Context r5) {
            java.lang.String r0 = getSelectedLocationId(r5)
            java.util.List r1 = getLocations(r5)
            java.util.Iterator r2 = r1.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.storage.StorageLocation r3 = (ca.dnamobile.javalauncher.storage.StorageLocation) r3
            java.lang.String r4 = r3.getId()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto Lc
            return r3
        L23:
            java.lang.String r0 = "default"
            setSelectedLocationId(r5, r0)
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            ca.dnamobile.javalauncher.storage.StorageLocation r5 = (ca.dnamobile.javalauncher.storage.StorageLocation) r5
            return r5
    }

    public static java.lang.String getSelectedLocationId(android.content.Context r2) {
            android.content.SharedPreferences r2 = getPrefs(r2)
            java.lang.String r0 = "selected_location_id"
            java.lang.String r1 = "default"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L1a
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            return r1
    }

    public static java.io.File getSelectedMinecraftHome(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = getSelectedLauncherHome(r2)
            java.lang.String r1 = ".minecraft"
            r0.<init>(r2, r1)
            return r0
    }

    public static android.net.Uri getSelectedTreeUri(android.content.Context r1) {
            java.lang.String r1 = getSelectedTreeUriString(r1)
            if (r1 == 0) goto L1a
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L1a
        L11:
            java.lang.String r1 = r1.trim()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public static java.lang.String getSelectedTreeUriString(android.content.Context r1) {
            ca.dnamobile.javalauncher.storage.StorageLocation r1 = getSelectedLocation(r1)
            boolean r0 = r1.isDefaultLocation()
            if (r0 == 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            java.lang.String r1 = r1.getUriString()
        L10:
            return r1
    }

    public static java.util.List<java.io.File> getVisibleLauncherHomes(android.content.Context r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = getSelectedLauncherHome(r1)
            r0.add(r1)
            return r0
    }

    public static java.util.List<java.io.File> getVisibleMinecraftHomes(android.content.Context r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = getVisibleLauncherHomes(r4)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".minecraft"
            r2.<init>(r1, r3)
            r0.add(r2)
            goto Ld
        L24:
            return r0
    }

    private static boolean hasAnyInstanceMetadata(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            int r1 = r6.length
            r2 = r0
        La:
            if (r2 >= r1) goto L36
            r3 = r6[r2]
            if (r3 == 0) goto L33
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L17
            goto L33
        L17:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = ".pending_delete"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L24
            goto L33
        L24:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "instance.json"
            r4.<init>(r3, r5)
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L33
            r6 = 1
            return r6
        L33:
            int r2 = r2 + 1
            goto La
        L36:
            return r0
    }

    private static boolean hasAnyVersionMetadata(java.io.File r7) {
            java.io.File[] r7 = r7.listFiles()
            r0 = 0
            if (r7 != 0) goto L8
            return r0
        L8:
            int r1 = r7.length
            r2 = r0
        La:
            if (r2 >= r1) goto L47
            r3 = r7[r2]
            if (r3 == 0) goto L44
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L17
            goto L44
        L17:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = ".pending_delete"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L24
            goto L44
        L24:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = ".json"
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r3, r4)
            boolean r3 = r5.isFile()
            if (r3 == 0) goto L44
            r7 = 1
            return r7
        L44:
            int r2 = r2 + 1
            goto La
        L47:
            return r0
    }

    private static boolean isChildOf(java.io.File r1, java.io.File r2) throws java.lang.Exception {
            java.lang.String r1 = r1.getCanonicalPath()
            java.lang.String r2 = r2.getCanonicalPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            boolean r1 = r2.startsWith(r1)
            return r1
    }

    private static boolean isMinecraftTreeUri(android.content.Context r4, android.net.Uri r5) {
            java.io.File r4 = resolveTreeUriToFile(r4, r5)
            r0 = 1
            java.lang.String r1 = ".minecraft"
            if (r4 == 0) goto L14
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L14
            return r0
        L14:
            r4 = 0
            java.lang.String r5 = android.provider.DocumentsContract.getTreeDocumentId(r5)     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L1c
            return r4
        L1c:
            r2 = 92
            r3 = 47
            java.lang.String r5 = r5.replace(r2, r3)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3c
            java.lang.String r1 = "/.minecraft"
            boolean r1 = r5.endsWith(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3c
            java.lang.String r1 = ":.minecraft"
            boolean r5 = r5.endsWith(r1)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r4
        L3c:
            return r0
        L3d:
            return r4
    }

    private static boolean isMirrorBackedStorageLocation(android.content.Context r3, ca.dnamobile.javalauncher.storage.StorageLocation r4) {
            java.lang.String r4 = r4.getLauncherHomePath()
            r0 = 0
            if (r4 == 0) goto L3f
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L3f
        L12:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L3f
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "scoped_storage_mirrors"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3f
            java.io.File r3 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L3f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            java.io.File r4 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r4.equals(r3)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L3e
            boolean r3 = isChildOf(r3, r4)     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3f
        L3e:
            r0 = 1
        L3f:
            return r0
    }

    public static boolean isSelectedScopedStorage(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r2)
            boolean r1 = r0.isDefaultLocation()
            if (r1 != 0) goto L1c
            android.net.Uri r1 = getSelectedTreeUri(r2)
            if (r1 == 0) goto L1c
            boolean r2 = isMirrorBackedStorageLocation(r2, r0)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    private static boolean isVersionInheritanceChainReadyForLaunch(java.io.File r7, java.lang.String r8, java.util.Set<java.lang.String> r9) throws java.lang.Exception {
            java.lang.String r8 = r8.trim()
            boolean r0 = r8.isEmpty()
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r9.add(r8)
            r2 = 0
            java.lang.String r3 = "StorageLocationStore"
            if (r0 != 0) goto L28
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Circular version inheritance detected while checking scoped mirror: "
            r7.<init>(r9)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r7)
            return r2
        L28:
            java.io.File r0 = new java.io.File
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "versions"
            r4.<init>(r7, r5)
            r0.<init>(r4, r8)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r6 = ".json"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r0, r5)
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L69
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Scoped mirror is missing version JSON before launch: "
            r7.<init>(r8)
            java.lang.String r8 = r4.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r7)
            return r2
        L69:
            org.json.JSONObject r5 = new org.json.JSONObject
            java.lang.String r4 = readString(r4)
            r5.<init>(r4)
            java.lang.String r4 = "inheritsFrom"
            java.lang.String r6 = ""
            java.lang.String r4 = r5.optString(r4, r6)
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L89
            boolean r7 = isVersionInheritanceChainReadyForLaunch(r7, r4, r9)
            return r7
        L89:
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = ".jar"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r0, r8)
            boolean r8 = r7.isFile()
            if (r8 != 0) goto Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Scoped mirror is missing standalone client jar before launch: "
            r8.<init>(r9)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r7)
            return r2
        Lbe:
            return r1
    }

    private static void markMetadataRestoreChecked(java.io.File r2) {
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Ld
            boolean r0 = r2.mkdirs()     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Ld
            return
        Ld:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = ".scoped_storage_metadata_loaded"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L33
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L4c
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33
            r1 = 0
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L33
            r0 = 49
            r2.write(r0)     // Catch: java.lang.Throwable -> L29
            r2.close()     // Catch: java.lang.Throwable -> L33
            goto L4c
        L29:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> L33
        L32:
            throw r0     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to write scoped metadata marker: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
        L4c:
            return
    }

    public static boolean needsSelectedLocalPathRestoreForDetails(android.content.Context r3, java.io.File r4) {
            android.content.Context r3 = r3.getApplicationContext()
            r0 = 0
            if (r4 == 0) goto L3d
            boolean r3 = isSelectedScopedStorage(r3)
            if (r3 != 0) goto Le
            goto L3d
        Le:
            java.io.File r3 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            java.io.File r3 = r4.getAbsoluteFile()
        L17:
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L1f
            r3 = 1
            return r3
        L1f:
            java.io.File r4 = new java.io.File
            java.lang.String r1 = "instance.json"
            r4.<init>(r3, r1)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L3d
            java.io.File r4 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "game"
            r1.<init>(r3, r2)
            java.lang.String r3 = "options.txt"
            r4.<init>(r1, r3)
            r4.isFile()
        L3d:
            return r0
    }

    public static boolean needsSelectedTreeMetadataRestoreForAdapter(android.content.Context r4) {
            android.content.Context r4 = r4.getApplicationContext()
            boolean r0 = isSelectedScopedStorage(r4)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.io.File r4 = getSelectedLauncherHome(r4)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = ".minecraft"
            r0.<init>(r4, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".scoped_storage_metadata_loaded"
            r2.<init>(r4, r3)
            boolean r4 = r2.isFile()
            if (r4 != 0) goto L4b
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L30
            goto L4b
        L30:
            java.io.File r4 = new java.io.File
            java.lang.String r2 = "instances"
            r4.<init>(r0, r2)
            boolean r4 = hasAnyInstanceMetadata(r4)
            if (r4 != 0) goto L4b
            java.io.File r4 = new java.io.File
            java.lang.String r2 = "versions"
            r4.<init>(r0, r2)
            boolean r4 = hasAnyVersionMetadata(r4)
            if (r4 != 0) goto L4b
            r1 = 1
        L4b:
            return r1
    }

    public static boolean needsSelectedTreeRestoreForLaunch(android.content.Context r4, java.io.File r5, java.lang.String r6) {
            android.content.Context r4 = r4.getApplicationContext()
            boolean r0 = isSelectedScopedStorage(r4)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1
            if (r5 == 0) goto L1d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "instance.json"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L59
            boolean r5 = r2.isFile()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L1d
            return r0
        L1d:
            java.io.File r4 = getSelectedMinecraftHome(r4)     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L26
            java.lang.String r5 = ""
            goto L2a
        L26:
            java.lang.String r5 = r6.trim()     // Catch: java.lang.Throwable -> L59
        L2a:
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L3c
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L59
            r6.<init>()     // Catch: java.lang.Throwable -> L59
            boolean r5 = isVersionInheritanceChainReadyForLaunch(r4, r5, r6)     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L3c
            return r0
        L3c:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "assets"
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L59
            boolean r5 = r5.isDirectory()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L4a
            return r0
        L4a:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "libraries"
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L59
            boolean r4 = r5.isDirectory()     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L58
            return r0
        L58:
            return r1
        L59:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to check scoped mirror launch readiness: "
            r5.<init>(r6)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
            return r0
    }

    private static java.io.File normalizeSelectedDirectoryToLauncherHome(java.io.File r2) {
            java.lang.String r0 = ".minecraft"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L13
            return r0
        L13:
            return r2
    }

    private static org.json.JSONArray readAndCleanLocationArray(android.content.Context r13) {
            java.lang.String r0 = ""
            org.json.JSONArray r1 = readLocationArray(r13)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r4 = getSelectedLocationId(r13)
            r5 = 0
            r6 = r5
            r7 = r6
        L17:
            int r8 = r1.length()
            if (r5 >= r8) goto L62
            r8 = 1
            org.json.JSONObject r9 = r1.getJSONObject(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = "id"
            java.lang.String r10 = r9.optString(r10, r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = "name"
            java.lang.String r11 = r9.optString(r11, r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r12 = "uri"
            java.lang.String r9 = r9.optString(r12, r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r12 = r10.trim()     // Catch: java.lang.Throwable -> L5e
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r12 != 0) goto L57
            java.lang.String r12 = r9.trim()     // Catch: java.lang.Throwable -> L5e
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r12 != 0) goto L57
            boolean r12 = r3.add(r10)     // Catch: java.lang.Throwable -> L5e
            if (r12 != 0) goto L4f
            goto L57
        L4f:
            org.json.JSONObject r9 = toJson(r10, r11, r9)     // Catch: java.lang.Throwable -> L5e
            r2.put(r9)     // Catch: java.lang.Throwable -> L5e
            goto L5f
        L57:
            boolean r6 = r10.equals(r4)     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L5e
            r7 = r8
        L5e:
            r6 = r8
        L5f:
            int r5 = r5 + 1
            goto L17
        L62:
            if (r6 == 0) goto L82
            android.content.SharedPreferences r13 = getPrefs(r13)
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r0 = "locations_json"
            java.lang.String r1 = r2.toString()
            android.content.SharedPreferences$Editor r13 = r13.putString(r0, r1)
            if (r7 == 0) goto L7f
            java.lang.String r0 = "selected_location_id"
            java.lang.String r1 = "default"
            r13.putString(r0, r1)
        L7f:
            r13.apply()
        L82:
            return r2
    }

    private static org.json.JSONArray readLocationArray(android.content.Context r3) {
            android.content.SharedPreferences r3 = getPrefs(r3)
            java.lang.String r0 = "locations_json"
            java.lang.String r1 = "[]"
            java.lang.String r3 = r3.getString(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L1c
            java.lang.String r2 = r3.trim()     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            return r3
    }

    private static java.lang.String readString(java.io.File r4) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2b
        Le:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            if (r2 == r3) goto L1a
            r3 = 0
            r4.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2b
            goto Le
        L1a:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r4.toString(r1)     // Catch: java.lang.Throwable -> L2b
            r4.close()     // Catch: java.lang.Throwable -> L35
            r0.close()
            return r1
        L2b:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L35
        L34:
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r4.addSuppressed(r0)
        L3e:
            throw r4
    }

    private static java.lang.String relativePath(java.io.File r1, java.io.File r2) throws java.lang.Exception {
            java.lang.String r1 = r1.getCanonicalPath()
            java.lang.String r2 = r2.getCanonicalPath()
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L11
            java.lang.String r1 = ""
            return r1
        L11:
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
        L19:
            java.lang.String r2 = java.io.File.separator
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L27
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            goto L19
        L27:
            char r2 = java.io.File.separatorChar
            r0 = 47
            java.lang.String r1 = r1.replace(r2, r0)
            return r1
    }

    private static void releasePersistablePermissionIfPossible(android.content.Context r1, java.lang.String r2) {
            if (r2 == 0) goto L37
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L37
        Ld:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L1e
            r0 = 3
            r1.releasePersistableUriPermission(r2, r0)     // Catch: java.lang.Throwable -> L1e
            goto L37
        L1e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to release storage URI permission: "
            r2.<init>(r0)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L37:
            return
    }

    public static boolean removeLocation(android.content.Context r11, java.lang.String r12) {
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.String r0 = "default"
            boolean r1 = r0.equals(r12)
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            org.json.JSONArray r1 = readLocationArray(r11)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = ""
            r5 = r2
            r6 = r5
            r7 = r4
        L1c:
            int r8 = r1.length()
            r9 = 1
            if (r5 >= r8) goto L42
            org.json.JSONObject r8 = r1.getJSONObject(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r10 = "id"
            java.lang.String r10 = r8.optString(r10, r4)     // Catch: java.lang.Throwable -> L3f
            boolean r10 = r12.equals(r10)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L3c
            java.lang.String r6 = "uri"
            java.lang.String r6 = r8.optString(r6, r4)     // Catch: java.lang.Throwable -> L3a
            r7 = r6
        L3a:
            r6 = r9
            goto L3f
        L3c:
            r3.put(r8)     // Catch: java.lang.Throwable -> L3f
        L3f:
            int r5 = r5 + 1
            goto L1c
        L42:
            if (r6 != 0) goto L45
            return r2
        L45:
            android.content.SharedPreferences r1 = getPrefs(r11)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "locations_json"
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            java.lang.String r2 = getSelectedLocationId(r11)
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L66
            java.lang.String r12 = "selected_location_id"
            r1.putString(r12, r0)
        L66:
            r1.apply()
            releasePersistablePermissionIfPossible(r11, r7)
            return r9
    }

    public static java.io.File resolveTreeUriToFile(android.content.Context r5, android.net.Uri r6) {
            r5 = 0
            java.lang.String r0 = "file"
            java.lang.String r1 = r6.getScheme()     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L25
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L24
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L1e
            goto L24
        L1e:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8a
            r5 = r1
        L24:
            return r5
        L25:
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r6)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L89
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L36
            goto L89
        L36:
            r1 = 58
            int r1 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = ""
            if (r1 < 0) goto L53
            r3 = 0
            java.lang.String r3 = r0.substring(r3, r1)     // Catch: java.lang.Throwable -> L8a
            int r1 = r1 + 1
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L8a
            if (r1 >= r4) goto L52
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> L8a
            r2 = r0
        L52:
            r0 = r3
        L53:
            java.lang.String r1 = "primary"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L60
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L8a
            goto L77
        L60:
            java.lang.String r1 = "home"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L6f
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOCUMENTS     // Catch: java.lang.Throwable -> L8a
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch: java.lang.Throwable -> L8a
            goto L77
        L6f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = "/storage"
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L8a
            r0 = r1
        L77:
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L82
            goto L88
        L82:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L8a
            r0 = r1
        L88:
            return r0
        L89:
            return r5
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve tree URI "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)
            return r5
    }

    public static java.io.File resolveTreeUriToLauncherHome(android.content.Context r0, android.net.Uri r1) {
            java.io.File r0 = resolveTreeUriToFile(r0, r1)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.io.File r0 = normalizeSelectedDirectoryToLauncherHome(r0)
            return r0
    }

    public static void setSelectedLocationId(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = getPrefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "selected_location_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void syncSelectedLocalPathFromTree(android.content.Context r3, java.io.File r4, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r5) throws java.lang.Exception {
            android.content.Context r3 = r3.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r3)
            boolean r1 = r0.isDefaultLocation()
            if (r1 == 0) goto Lf
            return
        Lf:
            boolean r0 = isMirrorBackedStorageLocation(r3, r0)
            if (r0 != 0) goto L16
            return
        L16:
            android.net.Uri r0 = getSelectedTreeUri(r3)
            if (r0 != 0) goto L1d
            return
        L1d:
            java.io.File r1 = getSelectedLocalRootForTree(r3, r0)
            java.io.File r1 = r1.getCanonicalFile()
            java.io.File r4 = r4.getCanonicalFile()
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L4e
            boolean r2 = isChildOf(r1, r4)
            if (r2 != 0) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Skipping scoped relative restore outside selected mirror: "
            r3.<init>(r5)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "StorageLocationStore"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
        L4e:
            java.lang.String r4 = relativePath(r1, r4)
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror.copyRelativePathToLocalLauncherHome(r3, r0, r1, r4, r5)
            return
    }

    public static void syncSelectedMirrorToTree(android.content.Context r2, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r3) throws java.lang.Exception {
            android.content.Context r2 = r2.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r2)
            boolean r1 = r0.isDefaultLocation()
            if (r1 == 0) goto Lf
            return
        Lf:
            boolean r0 = isMirrorBackedStorageLocation(r2, r0)
            if (r0 != 0) goto L16
            return
        L16:
            android.net.Uri r0 = getSelectedTreeUri(r2)
            if (r0 != 0) goto L1d
            return
        L1d:
            java.io.File r1 = getSelectedLocalRootForTree(r2, r0)
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror.copyLocalLauncherHomeToTree(r2, r1, r0, r3)
            return
    }

    public static void syncSelectedTreeMetadataToMirror(android.content.Context r2, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r3) throws java.lang.Exception {
            android.content.Context r2 = r2.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r2)
            boolean r1 = r0.isDefaultLocation()
            if (r1 == 0) goto Lf
            return
        Lf:
            boolean r0 = isMirrorBackedStorageLocation(r2, r0)
            if (r0 != 0) goto L16
            return
        L16:
            android.net.Uri r0 = getSelectedTreeUri(r2)
            if (r0 != 0) goto L1d
            return
        L1d:
            java.io.File r1 = getSelectedLocalRootForTree(r2, r0)
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror.copyTreeMetadataToLocalLauncherHome(r2, r0, r1, r3)
            markMetadataRestoreChecked(r1)
            return
    }

    public static void syncSelectedTreeToMirror(android.content.Context r2, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r3) throws java.lang.Exception {
            android.content.Context r2 = r2.getApplicationContext()
            ca.dnamobile.javalauncher.storage.StorageLocation r0 = getSelectedLocation(r2)
            boolean r1 = r0.isDefaultLocation()
            if (r1 == 0) goto Lf
            return
        Lf:
            boolean r0 = isMirrorBackedStorageLocation(r2, r0)
            if (r0 != 0) goto L16
            return
        L16:
            android.net.Uri r0 = getSelectedTreeUri(r2)
            if (r0 != 0) goto L1d
            return
        L1d:
            java.io.File r1 = getSelectedLocalRootForTree(r2, r0)
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror.copyTreeToLocalLauncherHome(r2, r0, r1, r3)
            return
    }

    private static org.json.JSONObject toJson(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "name"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "uri"
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L14
        L14:
            return r0
    }
}
