package ca.dnamobile.javalauncher.instance;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherInstanceManager {
    private static final java.lang.String METADATA_FILE = "instance.json";
    private static final java.lang.String TAG = "InstanceManager";

    public static /* synthetic */ int $r8$lambda$K2zQNHuhx1z8MLNRnLf97nhoOGo(java.lang.String r0, java.lang.String r1) {
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private LauncherInstanceManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String cleanDisplayName(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = ")"
            java.lang.String r2 = " ("
            if (r0 == 0) goto L27
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
        L27:
            r0 = 10
            r3 = 32
            java.lang.String r4 = r4.replace(r0, r3)
            r0 = 13
            java.lang.String r4 = r4.replace(r0, r3)
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
        L58:
            return r4
    }

    private static void copyUri(android.content.Context r2, android.net.Uri r3, java.io.File r4) throws java.lang.Exception {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L9
            ensureDirectory(r0)
        L9:
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.io.InputStream r2 = r2.openInputStream(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L33
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L31
        L1c:
            int r0 = r2.read(r4)     // Catch: java.lang.Throwable -> L31
            r1 = -1
            if (r0 == r1) goto L28
            r1 = 0
            r3.write(r4, r1, r0)     // Catch: java.lang.Throwable -> L31
            goto L1c
        L28:
            r3.close()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L30
            r2.close()
        L30:
            return
        L31:
            r4 = move-exception
            goto L3b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "Unable to open selected icon."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L3b:
            r3.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L44
        L43:
            throw r4     // Catch: java.lang.Throwable -> L44
        L44:
            r3 = move-exception
            if (r2 == 0) goto L4f
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r2 = move-exception
            r3.addSuppressed(r2)
        L4f:
            throw r3
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance createInstance(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, android.net.Uri r12) throws java.lang.Exception {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r10
            r5 = r11
            r6 = r12
            ca.dnamobile.javalauncher.instance.LauncherInstance r7 = createInstance(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance createInstance(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, android.net.Uri r21) throws java.lang.Exception {
            r0 = r15
            r1 = r21
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r15)
            java.lang.String r2 = r19.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L15
            java.lang.String r2 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r18)
            goto L19
        L15:
            java.lang.String r2 = r19.trim()
        L19:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L22
            r9 = r18
            goto L23
        L22:
            r9 = r2
        L23:
            java.lang.String r6 = cleanDisplayName(r16, r17, r18)
            java.lang.String r5 = uniqueIdForName(r6)
            java.io.File r11 = createUniqueInstanceRoot(r5)
            java.io.File r12 = new java.io.File
            java.lang.String r2 = "game"
            r12.<init>(r11, r2)
            ensureDirectory(r12)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "saves"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "resourcepacks"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "shaderpacks"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "mods"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "config"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "logs"
            r2.<init>(r12, r3)
            ensureDirectory(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "metadata"
            r2.<init>(r11, r3)
            ensureDirectory(r2)
            ca.dnamobile.javalauncher.instance.DefaultMinecraftOptionsInstaller.installIfMissingForNewInstance(r15, r12, r9)
            if (r1 == 0) goto L90
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "icon"
            r2.<init>(r11, r3)
            copyUri(r15, r1, r2)
            r13 = r2
            goto L92
        L90:
            r0 = 0
            r13 = r0
        L92:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r14 = r0.format(r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "schema"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "id"
            r0.put(r1, r5)
            java.lang.String r1 = "name"
            r0.put(r1, r6)
            java.lang.String r1 = "loader"
            r2 = r17
            r0.put(r1, r2)
            java.lang.String r1 = "baseVersionId"
            r3 = r18
            r0.put(r1, r3)
            java.lang.String r1 = "minecraftVersionId"
            r0.put(r1, r9)
            java.lang.String r1 = "versionType"
            r10 = r20
            r0.put(r1, r10)
            java.lang.String r1 = "rootDirectory"
            java.lang.String r4 = r11.getAbsolutePath()
            r0.put(r1, r4)
            java.lang.String r1 = "gameDirectory"
            java.lang.String r4 = r12.getAbsolutePath()
            r0.put(r1, r4)
            if (r13 == 0) goto Lec
            java.lang.String r1 = r13.getAbsolutePath()
            goto Lee
        Lec:
            java.lang.String r1 = ""
        Lee:
            java.lang.String r4 = "iconFile"
            r0.put(r4, r1)
            java.lang.String r1 = "createdAt"
            r0.put(r1, r14)
            java.lang.String r1 = "storageMode"
            java.lang.String r4 = "storage_location"
            r0.put(r1, r4)
            java.lang.String r1 = "launcherHome"
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            r0.put(r1, r4)
            java.lang.String r1 = "minecraftHome"
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.put(r1, r4)
            java.lang.String r1 = "note"
            java.lang.String r4 = "Shared game files live under this storage location's .minecraft/versions/libraries/assets. This directory isolates saves/options/mods/resourcepacks for this launcher instance."
            r0.put(r1, r4)
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "instance.json"
            r1.<init>(r11, r4)
            r4 = 2
            java.lang.String r0 = r0.toString(r4)
            writeString(r1, r0)
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = new ca.dnamobile.javalauncher.instance.LauncherInstance
            r4 = r0
            r7 = r17
            r8 = r18
            r10 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    private static java.io.File createUniqueInstanceRoot(java.lang.String r5) {
            java.io.File r0 = getInstancesRoot()
            ensureDirectory(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r5)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L13
            return r1
        L13:
            r1 = 2
        L14:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = "-"
            if (r1 >= r2) goto L3e
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L3b
            return r2
        L3b:
            int r1 = r1 + 1
            goto L14
        L3e:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r0, r5)
            return r1
    }

    public static void deleteInstance(android.content.Context r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) throws java.lang.Exception {
            java.lang.String r0 = r4.getId()
            java.lang.String r1 = r4.getBaseVersionId()
            java.io.File r2 = r4.getRootDirectory()
            boolean r4 = r4.isIsolated()
            deleteInstance(r3, r0, r1, r2, r4)
            return
    }

    public static void deleteInstance(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.io.File r7, boolean r8) throws java.lang.Exception {
            java.lang.String r0 = "InstanceManager"
            java.lang.String r1 = "Deleted scoped-storage copy for instance "
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r4)
            java.io.File r2 = getDeleteTargetDirectory(r6, r7, r8)
            java.io.File r2 = r2.getCanonicalFile()
            if (r8 == 0) goto L4e
            java.io.File r6 = r7.getParentFile()
            if (r6 == 0) goto L20
            java.io.File r6 = r7.getParentFile()
            java.io.File r6 = r6.getCanonicalFile()
            goto L28
        L20:
            java.io.File r6 = getInstancesRoot()
            java.io.File r6 = r6.getCanonicalFile()
        L28:
            boolean r7 = r2.equals(r6)
            if (r7 != 0) goto L35
            boolean r6 = isChildOf(r6, r2)
            if (r6 == 0) goto L35
            goto L74
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Refusing to delete unsafe instance path: "
            r5.<init>(r6)
            java.lang.String r6 = r2.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4e:
            java.io.File r8 = new java.io.File
            java.lang.String r3 = "versions"
            r8.<init>(r7, r3)
            java.io.File r7 = r8.getCanonicalFile()
            java.io.File r8 = r2.getParentFile()
            if (r8 == 0) goto L68
            java.io.File r8 = r2.getParentFile()
            java.io.File r8 = r8.getCanonicalFile()
            goto L69
        L68:
            r8 = 0
        L69:
            if (r8 == 0) goto Lf5
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lf5
            ensureSharedVersionIsNotRequired(r4, r6)
        L74:
            boolean r4 = ca.dnamobile.javalauncher.storage.StorageLocationStore.deleteFromScopedStorageIfNeeded(r4, r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = " at "
            if (r4 == 0) goto L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lba
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> Lba
        L98:
            deleteRecursively(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Deleted instance "
            r4.<init>(r7)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = r2.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
            return
        Lba:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to delete scoped-storage copy for instance "
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r5, r4)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Scoped-storage copy could not be deleted. Local mirror was left untouched: "
            r6.<init>(r7)
            java.lang.String r7 = r4.getMessage()
            if (r7 == 0) goto Le1
            java.lang.String r7 = r4.getMessage()
            goto Le9
        Le1:
            java.lang.Class r7 = r4.getClass()
            java.lang.String r7 = r7.getSimpleName()
        Le9:
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        Lf5:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Refusing to delete unsafe shared version path: "
            r5.<init>(r6)
            java.lang.String r6 = r2.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private static void deleteRecursively(java.io.File r4) throws java.lang.Exception {
            boolean r0 = r4.exists()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            deleteRecursively(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            boolean r0 = r4.delete()
            if (r0 != 0) goto L3f
            boolean r0 = r4.exists()
            if (r0 != 0) goto L26
            goto L3f
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L3f:
            return
    }

    private static void ensureDirectory(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L26
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L26:
            return
    }

    private static void ensureSharedVersionIsNotRequired(android.content.Context r3, java.lang.String r4) {
            java.util.ArrayList r0 = findSharedVersionDependents(r3, r4)
            java.util.ArrayList r3 = findIsolatedInstanceDependents(r3, r4)
            r0.addAll(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L12
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot delete shared version "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " because it is required by:\n"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r0 = formatDependentVersionList(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = "\nDelete those instances/loader versions first, or keep this shared version installed."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance findByNameOrId(android.content.Context r2, java.lang.String r3) {
            java.util.ArrayList r2 = findInstances(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r0
            java.lang.String r1 = r0.getId()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8
        L28:
            return r0
        L29:
            r2 = 0
            return r2
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.instance.LauncherInstance> findInstances(android.content.Context r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List r9 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getVisibleMinecraftHomes(r9)
            java.util.Iterator r9 = r9.iterator()
        L12:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r9.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File r2 = getInstancesRoot(r2)
            java.io.File[] r2 = r2.listFiles()
            if (r2 != 0) goto L29
            goto L12
        L29:
            int r3 = r2.length
            r4 = 0
        L2b:
            if (r4 >= r3) goto L12
            r5 = r2[r4]
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L36
            goto L9c
        L36:
            java.io.File r6 = new java.io.File
            java.lang.String r7 = "instance.json"
            r6.<init>(r5, r7)
            boolean r7 = r6.isFile()
            if (r7 != 0) goto L44
            goto L9c
        L44:
            ca.dnamobile.javalauncher.instance.LauncherInstance r6 = readInstance(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r7.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r6.getId()     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = "@"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L75
            java.io.File r8 = r6.getRootDirectory()     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L75
            boolean r7 = r1.add(r7)     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L9c
            r0.add(r6)     // Catch: java.lang.Throwable -> L75
            goto L9c
        L75:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skipping broken instance "
            r7.<init>(r8)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "InstanceManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        L9c:
            int r4 = r4 + 1
            goto L2b
        L9f:
            ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda1 r9 = new ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda1
            r9.<init>()
            r0.sort(r9)
            return r0
    }

    public static java.util.ArrayList<java.lang.String> findIsolatedInstanceDependents(android.content.Context r5, java.lang.String r6) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r6.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.ArrayList r5 = findInstances(r5)
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r5.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r1
            java.lang.String r2 = r1.getBaseVersionId()
            java.io.File r3 = getMinecraftHomeForInstance(r1)
            boolean r4 = r6.equals(r2)
            if (r4 != 0) goto L40
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            boolean r2 = versionInheritsFrom(r3, r2, r6, r4)
            if (r2 == 0) goto L1b
        L40:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " (instance)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L1b
        L5b:
            ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda0 r5 = new ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda0
            r5.<init>()
            r0.sort(r5)
            return r0
    }

    public static java.util.ArrayList<java.lang.String> findSharedVersionDependents(android.content.Context r10, java.lang.String r11) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r11.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.List r10 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getVisibleMinecraftHomes(r10)
            java.util.Iterator r10 = r10.iterator()
        L1b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lde
            java.lang.Object r1 = r10.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "versions"
            r2.<init>(r1, r3)
            java.io.File[] r2 = r2.listFiles()
            if (r2 != 0) goto L35
            goto L1b
        L35:
            int r3 = r2.length
            r4 = 0
        L37:
            if (r4 >= r3) goto L1b
            r5 = r2[r4]
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L43
            goto Lda
        L43:
            java.lang.String r6 = r5.getName()
            boolean r7 = r11.equals(r6)
            if (r7 == 0) goto L4f
            goto Lda
        L4f:
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r9 = ".json"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r5, r8)
            boolean r5 = r7.isFile()
            if (r5 != 0) goto L6e
            goto Lda
        L6e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = readString(r7)     // Catch: java.lang.Throwable -> Lb7
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = "inheritsFrom"
            java.lang.String r8 = ""
            java.lang.String r7 = r5.optString(r7, r8)     // Catch: java.lang.Throwable -> Lb7
            boolean r7 = r11.equals(r7)     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto Lda
            java.lang.String r7 = "id"
            java.lang.String r5 = r5.optString(r7, r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r7.<init>()     // Catch: java.lang.Throwable -> Lb7
            boolean r8 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto L97
            r5 = r6
        L97:
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = " ("
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = ")"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb7
            r0.add(r5)     // Catch: java.lang.Throwable -> Lb7
            goto Lda
        Lb7:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to inspect shared version dependency for "
            r7.<init>(r8)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "InstanceManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        Lda:
            int r4 = r4 + 1
            goto L37
        Lde:
            ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda0 r10 = new ca.dnamobile.javalauncher.instance.LauncherInstanceManager$$ExternalSyntheticLambda0
            r10.<init>()
            r0.sort(r10)
            return r0
    }

    public static java.lang.String formatDependentVersionList(java.util.List<java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L9
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            goto L9
        L22:
            int r2 = r0.length()
            if (r2 <= 0) goto L2d
            r2 = 10
            r0.append(r2)
        L2d:
            java.lang.String r2 = "• "
            java.lang.StringBuilder r2 = r0.append(r2)
            r2.append(r1)
            goto L9
        L37:
            int r3 = r0.length()
            if (r3 <= 0) goto L42
            java.lang.String r3 = r0.toString()
            goto L44
        L42:
            java.lang.String r3 = "• Unknown loader version"
        L44:
            return r3
    }

    public static java.io.File getDeleteTargetDirectory(ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
            java.lang.String r0 = r2.getBaseVersionId()
            java.io.File r1 = r2.getRootDirectory()
            boolean r2 = r2.isIsolated()
            java.io.File r2 = getDeleteTargetDirectory(r0, r1, r2)
            return r2
    }

    public static java.io.File getDeleteTargetDirectory(java.lang.String r2, java.io.File r3, boolean r4) {
            if (r4 == 0) goto L3
            return r3
        L3:
            java.lang.String r4 = r2.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L1a
            java.io.File r4 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "versions"
            r0.<init>(r3, r1)
            r4.<init>(r0, r2)
            return r4
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Shared version id is empty."
            r2.<init>(r3)
            throw r2
    }

    public static java.io.File getInstancesRoot() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            java.io.File r0 = getInstancesRoot(r0)
            return r0
    }

    public static java.io.File getInstancesRoot(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "instances"
            r0.<init>(r2, r1)
            return r0
    }

    private static java.io.File getMinecraftHomeForInstance(ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            boolean r0 = r1.isIsolated()
            if (r0 != 0) goto Lb
            java.io.File r1 = r1.getRootDirectory()
            return r1
        Lb:
            java.io.File r1 = r1.getRootDirectory()
            java.io.File r1 = r1.getParentFile()
            if (r1 == 0) goto L1a
            java.io.File r1 = r1.getParentFile()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L1e
            goto L25
        L1e:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r1.<init>(r0)
        L25:
            return r1
    }

    private static java.io.File inferMinecraftHome(java.io.File r2) {
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L17
            java.lang.String r0 = "instances"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L17
            java.io.File r2 = r2.getParentFile()
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L1b
            goto L22
        L1b:
            java.io.File r2 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r2.<init>(r0)
        L22:
            return r2
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

    public static boolean isSharedVersionRequiredByIsolatedInstances(android.content.Context r0, java.lang.String r1) {
            java.util.ArrayList r0 = findIsolatedInstanceDependents(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    static /* synthetic */ int lambda$findInstances$0(ca.dnamobile.javalauncher.instance.LauncherInstance r0, ca.dnamobile.javalauncher.instance.LauncherInstance r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private static ca.dnamobile.javalauncher.instance.LauncherInstance readInstance(java.io.File r15) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = readString(r15)
            r0.<init>(r1)
            java.io.File r1 = requireParent(r15)
            java.lang.String r2 = "id"
            java.lang.String r3 = r1.getName()
            java.lang.String r5 = r0.optString(r2, r3)
            java.lang.String r2 = "name"
            java.lang.String r6 = r0.optString(r2, r5)
            java.lang.String r2 = "loader"
            java.lang.String r3 = "Vanilla"
            java.lang.String r7 = r0.optString(r2, r3)
            java.lang.String r2 = "baseVersionId"
            java.lang.String r3 = ""
            java.lang.String r8 = r0.optString(r2, r3)
            java.lang.String r9 = resolveStoredMinecraftVersionId(r0, r8, r1)
            java.lang.String r2 = "minecraftVersionId"
            java.lang.String r4 = r0.optString(r2, r3)
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L56
            java.lang.String r4 = r9.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L56
            r0.put(r2, r9)
            r2 = 2
            java.lang.String r2 = r0.toString(r2)
            writeString(r15, r2)
        L56:
            java.lang.String r15 = "versionType"
            java.lang.String r2 = "release"
            java.lang.String r10 = r0.optString(r15, r2)
            java.io.File r11 = resolveStoredRoot(r0, r1)
            java.io.File r12 = resolveStoredGameDirectory(r0, r11)
            java.io.File r13 = resolveStoredIconFile(r0, r11)
            java.lang.String r15 = "createdAt"
            java.lang.String r14 = r0.optString(r15, r3)
            ca.dnamobile.javalauncher.instance.LauncherInstance r15 = new ca.dnamobile.javalauncher.instance.LauncherInstance
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
    }

    private static java.lang.String readMinecraftVersionFromLaunchProfile(java.lang.String r5, java.io.File r6) {
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.io.File r6 = inferMinecraftHome(r6)
            java.io.File r0 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "versions"
            r3.<init>(r6, r4)
            r2.<init>(r3, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0.<init>(r2, r6)
            boolean r6 = r0.isFile()
            if (r6 != 0) goto L3c
            return r1
        L3c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = readString(r0)     // Catch: java.lang.Throwable -> L82
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "minecraftVersionId"
            java.lang.String r0 = r6.optString(r0, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L82
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L56
            return r0
        L56:
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r0 = r6.optString(r0, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L82
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L67
            return r0
        L67:
            java.lang.String r0 = "jar"
            java.lang.String r6 = r6.optString(r0, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L82
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto La5
            boolean r0 = r6.equals(r5)     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto La5
            java.lang.String r5 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r6)     // Catch: java.lang.Throwable -> L82
            return r5
        L82:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve Minecraft version for "
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "InstanceManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        La5:
            return r1
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

    public static ca.dnamobile.javalauncher.instance.LauncherInstance renameInstance(android.content.Context r9, java.io.File r10, java.lang.String r11) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r9)
            java.io.File r10 = resolveMetadataFile(r10)
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = readString(r10)
            r0.<init>(r1)
            java.io.File r1 = requireParent(r10)
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "id"
            java.lang.String r2 = r0.optString(r3, r2)
            java.lang.String r4 = "loader"
            java.lang.String r5 = "Vanilla"
            java.lang.String r4 = r0.optString(r4, r5)
            java.lang.String r5 = "baseVersionId"
            java.lang.String r6 = ""
            java.lang.String r5 = r0.optString(r5, r6)
            java.lang.String r7 = resolveStoredMinecraftVersionId(r0, r5, r1)
            java.lang.String r11 = cleanDisplayName(r11, r4, r5)
            java.lang.String r4 = r11.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Ld6
            java.util.ArrayList r9 = findInstances(r9)
            java.util.Iterator r9 = r9.iterator()
        L48:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r9.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r4 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r4
            java.lang.String r5 = r4.getId()
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L48
            java.io.File r5 = r4.getRootDirectory()
            java.lang.String r5 = safeCanonicalPath(r5)
            java.lang.String r8 = safeCanonicalPath(r1)
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L71
            goto L48
        L71:
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equalsIgnoreCase(r11)
            if (r4 != 0) goto L7c
            goto L48
        L7c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "An instance named "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " already exists."
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L97:
            java.io.File r9 = resolveStoredGameDirectory(r0, r1)
            java.io.File r4 = resolveStoredIconFile(r0, r1)
            r0.put(r3, r2)
            java.lang.String r2 = "name"
            r0.put(r2, r11)
            java.lang.String r11 = "minecraftVersionId"
            r0.put(r11, r7)
            java.lang.String r11 = "rootDirectory"
            java.lang.String r1 = r1.getAbsolutePath()
            r0.put(r11, r1)
            java.lang.String r11 = "gameDirectory"
            java.lang.String r9 = r9.getAbsolutePath()
            r0.put(r11, r9)
            if (r4 == 0) goto Lc4
            java.lang.String r6 = r4.getAbsolutePath()
        Lc4:
            java.lang.String r9 = "iconFile"
            r0.put(r9, r6)
            r9 = 2
            java.lang.String r9 = r0.toString(r9)
            writeString(r10, r9)
            ca.dnamobile.javalauncher.instance.LauncherInstance r9 = readInstance(r10)
            return r9
        Ld6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Instance name is empty."
            r9.<init>(r10)
            throw r9
    }

    private static java.io.File requireParent(java.io.File r3) {
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing parent folder for: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.String resolveImageExtension(android.content.Context r3, android.net.Uri r4) {
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = r3.getType(r4)     // Catch: java.lang.Throwable -> L9
            goto La
        L9:
            r3 = 0
        La:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equalsIgnoreCase(r3)
            java.lang.String r1 = ".jpg"
            if (r0 != 0) goto L5d
            java.lang.String r0 = "image/jpg"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L1d
            goto L5d
        L1d:
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equalsIgnoreCase(r3)
            java.lang.String r2 = ".webp"
            if (r0 == 0) goto L28
            return r2
        L28:
            java.lang.String r0 = "image/gif"
            boolean r3 = r0.equalsIgnoreCase(r3)
            java.lang.String r0 = ".gif"
            if (r3 == 0) goto L33
            return r0
        L33:
            java.lang.String r3 = r4.toString()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            boolean r4 = r3.endsWith(r1)
            if (r4 != 0) goto L5d
            java.lang.String r4 = ".jpeg"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L4c
            goto L5d
        L4c:
            boolean r4 = r3.endsWith(r2)
            if (r4 == 0) goto L53
            return r2
        L53:
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L5a
            return r0
        L5a:
            java.lang.String r3 = ".png"
            return r3
        L5d:
            return r1
    }

    private static java.io.File resolveMetadataFile(java.io.File r3) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "instance.json"
            r0.<init>(r3, r1)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto Le
            return r0
        Le:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L20
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L20
            return r2
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instance metadata was not found: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.io.File resolveStoredGameDirectory(org.json.JSONObject r4, java.io.File r5) {
            java.lang.String r0 = "gameDirectory"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.optString(r0, r1)
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "game"
            if (r0 == 0) goto L1a
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r1)
            return r4
        L1a:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = safeCanonicalPath(r5)
            java.lang.String r2 = safeCanonicalPath(r0)
            boolean r3 = r2.equals(r4)
            if (r3 != 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r4 = r3.append(r4)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L47
            goto L4d
        L47:
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r1)
            return r4
        L4d:
            return r0
    }

    private static java.io.File resolveStoredIconFile(org.json.JSONObject r3, java.io.File r4) {
            java.lang.String r0 = "iconFile"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r3 = 0
            return r3
        L14:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.lang.String r3 = safeCanonicalPath(r4)
            java.lang.String r1 = safeCanonicalPath(r0)
            boolean r2 = r1.equals(r3)
            if (r2 != 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L41
            goto L51
        L41:
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r0.getName()
            r3.<init>(r4, r1)
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L51
            r0 = r3
        L51:
            return r0
    }

    private static java.lang.String resolveStoredMinecraftVersionId(org.json.JSONObject r2, java.lang.String r3, java.io.File r4) {
            java.lang.String r0 = "minecraftVersionId"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.optString(r0, r1)
            java.lang.String r2 = r2.trim()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            return r2
        L13:
            java.lang.String r2 = readMinecraftVersionFromLaunchProfile(r3, r4)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r2 = ca.dnamobile.javalauncher.modmanager.ModManagerVersionResolver.resolveGameVersionForContent(r3)
            java.lang.String r4 = r2.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            return r3
    }

    private static java.io.File resolveStoredRoot(org.json.JSONObject r3, java.io.File r4) {
            java.lang.String r0 = "rootDirectory"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            return r4
        L13:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "instance.json"
            r3.<init>(r0, r1)
            boolean r2 = r3.isFile()
            if (r2 != 0) goto L26
            return r4
        L26:
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L3b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r2.getCanonicalPath()     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L3a
            return r4
        L3a:
            return r0
        L3b:
            return r4
    }

    private static java.lang.String safeCanonicalPath(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static java.lang.String uniqueIdForName(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "[^a-z0-9._ -]"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            r0 = 32
            r2 = 45
            java.lang.String r3 = r3.replace(r0, r2)
            java.lang.String r0 = "-+"
            java.lang.String r2 = "-"
            java.lang.String r3 = r3.replaceAll(r0, r2)
            java.lang.String r0 = "^-|-$"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L2c
            java.lang.String r3 = "instance"
        L2c:
            return r3
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance updateInstanceIcon(android.content.Context r7, java.io.File r8, android.net.Uri r9) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r7)
            java.io.File r8 = resolveMetadataFile(r8)
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = readString(r8)
            r0.<init>(r1)
            java.io.File r1 = requireParent(r8)
            java.io.File r2 = resolveStoredGameDirectory(r0, r1)
            java.io.File r3 = resolveStoredIconFile(r0, r1)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "icon"
            r5.<init>(r6)
            java.lang.String r6 = resolveImageExtension(r7, r9)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r1, r5)
            copyUri(r7, r9, r4)
            if (r3 == 0) goto L56
            java.lang.String r7 = safeCanonicalPath(r3)
            java.lang.String r9 = safeCanonicalPath(r4)
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L56
            boolean r7 = isChildOf(r1, r3)
            if (r7 == 0) goto L56
            boolean r7 = r3.isFile()
            if (r7 == 0) goto L56
            r3.delete()
        L56:
            java.lang.String r7 = "rootDirectory"
            java.lang.String r9 = r1.getAbsolutePath()
            r0.put(r7, r9)
            java.lang.String r7 = "gameDirectory"
            java.lang.String r9 = r2.getAbsolutePath()
            r0.put(r7, r9)
            java.lang.String r7 = "iconFile"
            java.lang.String r9 = r4.getAbsolutePath()
            r0.put(r7, r9)
            r7 = 2
            java.lang.String r7 = r0.toString(r7)
            writeString(r8, r7)
            ca.dnamobile.javalauncher.instance.LauncherInstance r7 = readInstance(r8)
            return r7
    }

    private static boolean versionInheritsFrom(java.io.File r5, java.lang.String r6, java.lang.String r7, java.util.HashSet<java.lang.String> r8) {
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L89
            boolean r0 = r8.add(r6)
            if (r0 != 0) goto L12
            goto L89
        L12:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "versions"
            r0.<init>(r5, r2)
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r4 = ".json"
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            boolean r0 = r2.isFile()
            if (r0 != 0) goto L3d
            return r1
        L3d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = readString(r2)     // Catch: java.lang.Throwable -> L66
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.optString(r2, r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L66
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L59
            return r1
        L59:
            boolean r2 = r7.equals(r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L61
            r5 = 1
            return r5
        L61:
            boolean r5 = versionInheritsFrom(r5, r0, r7, r8)     // Catch: java.lang.Throwable -> L66
            return r5
        L66:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to inspect inherited version chain for "
            r7.<init>(r8)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "InstanceManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        L89:
            return r1
    }

    private static void writeString(java.io.File r1, java.lang.String r2) throws java.lang.Exception {
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L9
            ensureDirectory(r0)
        L9:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1b
            byte[] r1 = r2.getBytes(r1)     // Catch: java.lang.Throwable -> L1b
            r0.write(r1)     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r2 = move-exception
            r1.addSuppressed(r2)
        L24:
            throw r1
    }
}
