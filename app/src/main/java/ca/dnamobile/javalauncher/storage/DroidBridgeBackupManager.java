package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeBackupManager {
    private static final int BUFFER_SIZE = 131072;
    private static final java.lang.String LAUNCHER_DATA_ROOT = "launcher_data/";
    private static final java.lang.String MANIFEST_NAME = "backup_manifest.json";
    private static final java.lang.String MINECRAFT_ROOT = ".minecraft/";
    private static final java.lang.String OLD_LAUNCHER_HOME_ROOT = "launcher_home/";
    private static final java.lang.String OLD_MINECRAFT_ROOT = "launcher_home/.minecraft/";

    private static final class Counter {
        long bytes;
        int files;
        long lastUpdateMs;

        private Counter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Counter(ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.CounterIA r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Counter-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class CounterIA {
    }

    public interface ProgressCallback {
        void onProgress(java.lang.String r1);
    }

    public static final class RestoreResult {
        public final long byteCount;
        public final int fileCount;
        public final java.lang.String previousDataPath;

        private RestoreResult(int r1, long r2, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.fileCount = r1
                r0.byteCount = r2
                r0.previousDataPath = r4
                return
        }

        /* synthetic */ RestoreResult(int r1, long r2, java.lang.String r4, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreResultIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class RestoreResultIA {
    }

    private static final class RestoreTarget {
        final boolean minecraft;
        final java.lang.String relativePath;

        RestoreTarget(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.minecraft = r1
                r0.relativePath = r2
                return
        }
    }

    public static final class Result {
        public final long byteCount;
        public final int fileCount;
        public final java.lang.String fileName;

        private Result(java.lang.String r1, int r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.fileName = r1
                r0.fileCount = r2
                r0.byteCount = r3
                return
        }

        /* synthetic */ Result(java.lang.String r1, int r2, long r3, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ResultIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Result-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ResultIA {
    }

    private DroidBridgeBackupManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreTarget cleanTarget(boolean r3, java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 92
            r2 = 47
            java.lang.String r4 = r4.replace(r1, r2)
        Lc:
            java.lang.String r1 = "/"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.String r4 = r4.substring(r1)
            goto Lc
        L1a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L2e
            java.lang.String r1 = "backup_manifest.json"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L29
            goto L2e
        L29:
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r0 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget
            r0.<init>(r3, r4)
        L2e:
            return r0
    }

    private static void copyDirectory(java.io.File r11, java.io.File r12, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r13, java.lang.String r14) throws java.lang.Exception {
            boolean r0 = r11.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r11.isDirectory()
            java.lang.String r1 = "Unable to create folder: "
            r2 = 0
            if (r0 == 0) goto L5e
            boolean r0 = r12.exists()
            if (r0 != 0) goto L3a
            boolean r0 = r12.mkdirs()
            if (r0 != 0) goto L3a
            boolean r0 = r12.isDirectory()
            if (r0 == 0) goto L23
            goto L3a
        L23:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L3a:
            java.io.File[] r11 = r11.listFiles()
            if (r11 != 0) goto L41
            return
        L41:
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.Arrays.sort(r11, r0)
            int r0 = r11.length
        L4a:
            if (r2 >= r0) goto L5d
            r1 = r11[r2]
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.getName()
            r3.<init>(r12, r4)
            copyDirectory(r1, r3, r13, r14)
            int r2 = r2 + 1
            goto L4a
        L5d:
            return
        L5e:
            java.io.File r0 = r12.getParentFile()
            if (r0 == 0) goto L8e
            boolean r3 = r0.exists()
            if (r3 != 0) goto L8e
            boolean r3 = r0.mkdirs()
            if (r3 != 0) goto L8e
            boolean r3 = r0.isDirectory()
            if (r3 == 0) goto L77
            goto L8e
        L77:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r1)
            java.lang.String r13 = r0.getAbsolutePath()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L8e:
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r1 = new byte[r0]
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r11)
            r3.<init>(r4, r0)
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Lf2
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf2
            r5.<init>(r12)     // Catch: java.lang.Throwable -> Lf2
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lf2
            r5 = 0
            r7 = r5
        La9:
            int r0 = r3.read(r1)     // Catch: java.lang.Throwable -> Le8
            r9 = -1
            if (r0 == r9) goto Lb6
            r4.write(r1, r2, r0)     // Catch: java.lang.Throwable -> Le8
            long r9 = (long) r0
            long r7 = r7 + r9
            goto La9
        Lb6:
            r4.close()     // Catch: java.lang.Throwable -> Lf2
            r3.close()
            long r0 = r11.lastModified()
            r12.setLastModified(r0)
            if (r13 == 0) goto Le7
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 <= 0) goto Le7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = "... "
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r13.onProgress(r11)
        Le7:
            return
        Le8:
            r11 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Led
            goto Lf1
        Led:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> Lf2
        Lf1:
            throw r11     // Catch: java.lang.Throwable -> Lf2
        Lf2:
            r11 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lf7
            goto Lfb
        Lf7:
            r12 = move-exception
            r11.addSuppressed(r12)
        Lfb:
            throw r11
    }

    public static ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Result createBackup(android.content.Context r9, java.io.File r10, android.net.Uri r11, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r12) throws java.lang.Exception {
            java.io.File r0 = resolveLauncherHome(r10)
            java.io.File r2 = resolveMinecraftHome(r10)
            boolean r10 = r2.isDirectory()
            if (r10 == 0) goto Lfe
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "DroidBridge_Backup_"
            r10.<init>(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd_HH-mm-ss"
            java.util.Locale r4 = java.util.Locale.US
            r1.<init>(r3, r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r1 = r1.format(r3)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r1 = ".zip"
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Creating "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r3 = "..."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            notify(r12, r1)
            java.lang.String r1 = android.provider.DocumentsContract.getTreeDocumentId(r11)
            android.net.Uri r11 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r11, r1)
            android.content.ContentResolver r1 = r9.getContentResolver()
            java.lang.String r3 = "application/zip"
            android.net.Uri r11 = android.provider.DocumentsContract.createDocument(r1, r11, r3, r10)
            if (r11 == 0) goto Lf6
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Counter r7 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Counter
            r1 = 0
            r7.<init>(r1)
            android.content.ContentResolver r1 = r9.getContentResolver()
            java.lang.String r3 = "w"
            java.io.OutputStream r11 = r1.openOutputStream(r11, r3)
            if (r11 == 0) goto Le3
            java.util.zip.ZipOutputStream r8 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> Le1
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Le1
            r3 = 131072(0x20000, float:1.83671E-40)
            r1.<init>(r11, r3)     // Catch: java.lang.Throwable -> Le1
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Le1
            r1 = 6
            r8.setLevel(r1)     // Catch: java.lang.Throwable -> Ld7
            writeManifest(r9, r0, r2, r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = ""
            r1 = r2
            r4 = r8
            r5 = r7
            r6 = r12
            zipDirectory(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r9 = "controlmap"
            zipLauncherSideDirectory(r0, r9, r8, r7, r12)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r9 = "mouse"
            zipLauncherSideDirectory(r0, r9, r8, r7, r12)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r9 = "background"
            zipLauncherSideDirectory(r0, r9, r8, r7, r12)     // Catch: java.lang.Throwable -> Ld7
            r8.close()     // Catch: java.lang.Throwable -> Le1
            if (r11 == 0) goto La6
            r11.close()
        La6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Backup complete: "
            r9.<init>(r11)
            int r11 = r7.files
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = " files • "
            java.lang.StringBuilder r9 = r9.append(r11)
            long r0 = r7.bytes
            java.lang.String r11 = formatBytes(r0)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            notify(r12, r9)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Result r9 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Result
            int r5 = r7.files
            long r6 = r7.bytes
            r8 = 0
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r6, r8)
            return r9
        Ld7:
            r9 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> Le1
        Le0:
            throw r9     // Catch: java.lang.Throwable -> Le1
        Le1:
            r9 = move-exception
            goto Leb
        Le3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le1
            java.lang.String r10 = "Unable to open the selected backup file for writing."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Le1
            throw r9     // Catch: java.lang.Throwable -> Le1
        Leb:
            if (r11 == 0) goto Lf5
            r11.close()     // Catch: java.lang.Throwable -> Lf1
            goto Lf5
        Lf1:
            r10 = move-exception
            r9.addSuppressed(r10)
        Lf5:
            throw r9
        Lf6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "The selected folder did not allow creating a backup file."
            r9.<init>(r10)
            throw r9
        Lfe:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "DroidBridge .minecraft folder does not exist: "
            r10.<init>(r11)
            java.lang.String r11 = r2.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private static void deleteChildren(java.io.File r3) throws java.lang.Exception {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L21
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L14
            return
        L14:
            int r0 = r3.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L20
            r2 = r3[r1]
            deleteRecursively(r2)
            int r1 = r1 + 1
            goto L16
        L20:
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Path is not a folder: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void deleteRecursively(java.io.File r4) throws java.lang.Exception {
            boolean r0 = r4.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L1f
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L1f
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            deleteRecursively(r3)
            int r2 = r2 + 1
            goto L15
        L1f:
            boolean r0 = r4.delete()
            if (r0 != 0) goto L45
            boolean r0 = r4.exists()
            if (r0 != 0) goto L2c
            goto L45
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L45:
            return
    }

    private static void drainEntry(java.util.zip.ZipInputStream r2, byte[] r3) throws java.lang.Exception {
        L0:
            int r0 = r2.read(r3)
            r1 = -1
            if (r0 == r1) goto L8
            goto L0
        L8:
            return
    }

    private static java.lang.String firstPathPart(java.lang.String r2) {
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            int r0 = r2.indexOf(r1)
            if (r0 < 0) goto L13
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L13:
            return r2
    }

    public static java.lang.String formatBytes(long r3) {
            r0 = 1024(0x400, double:5.06E-321)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = " B"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
        L1a:
            double r3 = (double) r3
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r3 = r3 / r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L33
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%.1f KB"
            java.lang.String r3 = java.lang.String.format(r0, r4, r3)
            return r3
        L33:
            double r3 = r3 / r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L49
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%.1f MB"
            java.lang.String r3 = java.lang.String.format(r0, r4, r3)
            return r3
        L49:
            double r3 = r3 / r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%.2f GB"
            java.lang.String r3 = java.lang.String.format(r0, r4, r3)
            return r3
    }

    private static boolean isAllowedLauncherSidePath(java.lang.String r1) {
            java.lang.String r1 = firstPathPart(r1)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "controlmap"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            java.lang.String r0 = "mouse"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            java.lang.String r0 = "background"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L23
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            return r1
    }

    private static boolean isDirectoryEmpty(java.io.File r2) {
            boolean r0 = r2.exists()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L13
            int r2 = r2.length
            if (r2 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private static boolean isMinecraftHeadPath(java.lang.String r2) {
            java.lang.String r2 = firstPathPart(r2)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "assets"
            r0.add(r1)
            java.lang.String r1 = "config"
            r0.add(r1)
            java.lang.String r1 = "crash-reports"
            r0.add(r1)
            java.lang.String r1 = "defaultconfigs"
            r0.add(r1)
            java.lang.String r1 = "downloads"
            r0.add(r1)
            java.lang.String r1 = "instances"
            r0.add(r1)
            java.lang.String r1 = "libraries"
            r0.add(r1)
            java.lang.String r1 = "logs"
            r0.add(r1)
            java.lang.String r1 = "mods"
            r0.add(r1)
            java.lang.String r1 = "resourcepacks"
            r0.add(r1)
            java.lang.String r1 = "saves"
            r0.add(r1)
            java.lang.String r1 = "screenshots"
            r0.add(r1)
            java.lang.String r1 = "shaderpacks"
            r0.add(r1)
            java.lang.String r1 = "versions"
            r0.add(r1)
            java.lang.String r1 = "options.txt"
            r0.add(r1)
            java.lang.String r1 = "servers.dat"
            r0.add(r1)
            java.lang.String r1 = "servers.dat_old"
            r0.add(r1)
            java.lang.String r1 = "launcher_profiles.json"
            r0.add(r1)
            java.lang.String r1 = "usercache.json"
            r0.add(r1)
            java.lang.String r1 = "usernamecache.json"
            r0.add(r1)
            boolean r2 = r0.contains(r2)
            return r2
    }

    static /* synthetic */ int lambda$copyDirectory$1(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    static /* synthetic */ int lambda$zipDirectory$0(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private static ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreTarget mapRestoreTarget(java.lang.String r6) {
        L0:
            java.lang.String r0 = "/"
            boolean r0 = r6.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto Le
            java.lang.String r6 = r6.substring(r1)
            goto L0
        Le:
            boolean r0 = r6.isEmpty()
            r2 = 0
            if (r0 != 0) goto La4
            java.lang.String r0 = "backup_manifest.json"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
            goto La4
        L1f:
            java.lang.String r0 = "launcher_home/.minecraft/"
            boolean r3 = r6.startsWith(r0)
            if (r3 == 0) goto L34
            int r0 = r0.length()
            java.lang.String r6 = r6.substring(r0)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r1, r6)
            return r6
        L34:
            java.lang.String r0 = ".minecraft/"
            boolean r3 = r6.startsWith(r0)
            if (r3 == 0) goto L49
            int r0 = r0.length()
            java.lang.String r6 = r6.substring(r0)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r1, r6)
            return r6
        L49:
            java.lang.String r3 = "launcher_data/"
            boolean r4 = r6.startsWith(r3)
            r5 = 0
            if (r4 == 0) goto L5f
            int r0 = r3.length()
            java.lang.String r6 = r6.substring(r0)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r5, r6)
            return r6
        L5f:
            java.lang.String r3 = "launcher_home/"
            boolean r4 = r6.startsWith(r3)
            if (r4 == 0) goto L8e
            int r3 = r3.length()
            java.lang.String r6 = r6.substring(r3)
            boolean r3 = r6.startsWith(r0)
            if (r3 == 0) goto L82
            int r0 = r0.length()
            java.lang.String r6 = r6.substring(r0)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r1, r6)
            return r6
        L82:
            boolean r0 = isAllowedLauncherSidePath(r6)
            if (r0 == 0) goto L8d
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r5, r6)
            return r6
        L8d:
            return r2
        L8e:
            boolean r0 = isMinecraftHeadPath(r6)
            if (r0 == 0) goto L99
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r1, r6)
            return r6
        L99:
            boolean r0 = isAllowedLauncherSidePath(r6)
            if (r0 == 0) goto La4
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r6 = cleanTarget(r5, r6)
            return r6
        La4:
            return r2
    }

    private static void maybeNotifyRestore(ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Counter r6, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r7) {
            long r0 = java.lang.System.currentTimeMillis()
            if (r7 == 0) goto L41
            int r2 = r6.files
            r3 = 1
            if (r2 == r3) goto L1b
            int r2 = r6.files
            int r2 = r2 % 50
            if (r2 == 0) goto L1b
            long r2 = r6.lastUpdateMs
            long r2 = r0 - r2
            r4 = 1500(0x5dc, double:7.41E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L41
        L1b:
            r6.lastUpdateMs = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Restoring "
            r0.<init>(r1)
            int r1 = r6.files
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " files • "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r6.bytes
            java.lang.String r6 = formatBytes(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r7.onProgress(r6)
        L41:
            return
    }

    private static java.lang.String normalizeZipEntryName(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r2 = r2.trim()
        L11:
            java.lang.String r0 = "/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1f
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            goto L11
        L1f:
            return r2
    }

    private static void notify(ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r0, java.lang.String r1) {
            if (r0 == 0) goto L5
            r0.onProgress(r1)
        L5:
            return
    }

    private static java.io.File resolveLauncherHome(java.io.File r2) {
            java.lang.String r0 = ".minecraft"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L13
            r2 = r0
        L13:
            return r2
    }

    private static java.io.File resolveMinecraftHome(java.io.File r2) {
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = ".minecraft"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            return r2
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            return r0
    }

    public static ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.RestoreResult restoreBackup(android.content.Context r21, android.net.Uri r22, java.io.File r23, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r24) throws java.lang.Exception {
            r0 = r24
            java.io.File r1 = resolveLauncherHome(r23)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".minecraft"
            r2.<init>(r1, r3)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L39
            boolean r4 = r1.mkdirs()
            if (r4 != 0) goto L39
            boolean r4 = r1.isDirectory()
            if (r4 == 0) goto L20
            goto L39
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create launcher home: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L39:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyy-MM-dd_HH-mm-ss"
            java.util.Locale r6 = java.util.Locale.US
            r4.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r4 = r4.format(r5)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = ".droidbridge_restore_tmp_"
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r1, r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = ".minecraft.before_restore_"
            r7.<init>(r8)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r1, r4)
            deleteRecursively(r5)
            boolean r4 = r6.mkdirs()
            if (r4 != 0) goto La1
            boolean r4 = r6.isDirectory()
            if (r4 == 0) goto L88
            goto La1
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create temporary restore folder: "
            r1.<init>(r2)
            java.lang.String r2 = r6.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La1:
            java.lang.String r4 = "Reading DroidBridge backup..."
            notify(r0, r4)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Counter r4 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$Counter
            r7 = 0
            r4.<init>(r7)
            android.content.ContentResolver r8 = r21.getContentResolver()     // Catch: java.lang.Throwable -> L339
            r9 = r22
            java.io.InputStream r8 = r8.openInputStream(r9)     // Catch: java.lang.Throwable -> L339
            if (r8 == 0) goto L320
            java.util.zip.ZipInputStream r9 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L31c
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L31c
            r11 = 131072(0x20000, float:1.83671E-40)
            r10.<init>(r8, r11)     // Catch: java.lang.Throwable -> L31c
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L31c
            byte[] r10 = new byte[r11]     // Catch: java.lang.Throwable -> L30f
            r13 = 0
            r14 = 0
        Lc8:
            java.util.zip.ZipEntry r15 = r9.getNextEntry()     // Catch: java.lang.Throwable -> L30f
            if (r15 == 0) goto L21d
            java.lang.String r16 = r15.getName()     // Catch: java.lang.Throwable -> L215
            java.lang.String r7 = normalizeZipEntryName(r16)     // Catch: java.lang.Throwable -> L215
            boolean r16 = r7.isEmpty()     // Catch: java.lang.Throwable -> L215
            if (r16 == 0) goto Lee
            r9.closeEntry()     // Catch: java.lang.Throwable -> Le9
        Ldf:
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r6
            goto L206
        Le9:
            r0 = move-exception
            r1 = r0
            r2 = r5
            goto L312
        Lee:
            java.lang.String r12 = "backup_manifest.json"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L215
            r16 = 1
            if (r12 == 0) goto L102
            drainEntry(r9, r10)     // Catch: java.lang.Throwable -> Le9
            r9.closeEntry()     // Catch: java.lang.Throwable -> Le9
            r13 = r16
            r7 = 0
            goto Lc8
        L102:
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreTarget r7 = mapRestoreTarget(r7)     // Catch: java.lang.Throwable -> L215
            if (r7 == 0) goto L1f8
            java.lang.String r12 = r7.relativePath     // Catch: java.lang.Throwable -> L215
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L215
            if (r12 == 0) goto L112
            goto L1f8
        L112:
            boolean r12 = r7.minecraft     // Catch: java.lang.Throwable -> L215
            if (r12 == 0) goto L118
            r12 = r6
            goto L119
        L118:
            r12 = r5
        L119:
            java.lang.String r11 = r7.relativePath     // Catch: java.lang.Throwable -> L215
            java.io.File r11 = safeResolveInside(r12, r11)     // Catch: java.lang.Throwable -> L215
            boolean r7 = r7.minecraft     // Catch: java.lang.Throwable -> L215
            if (r7 == 0) goto L125
            r14 = r16
        L125:
            boolean r7 = r15.isDirectory()     // Catch: java.lang.Throwable -> L215
            java.lang.String r12 = "Unable to create restore folder: "
            if (r7 == 0) goto L15f
            boolean r7 = r11.exists()     // Catch: java.lang.Throwable -> Le9
            if (r7 != 0) goto L15b
            boolean r7 = r11.mkdirs()     // Catch: java.lang.Throwable -> Le9
            if (r7 != 0) goto L15b
            boolean r7 = r11.isDirectory()     // Catch: java.lang.Throwable -> Le9
            if (r7 == 0) goto L140
            goto L15b
        L140:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r1.<init>()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le9
            throw r0     // Catch: java.lang.Throwable -> Le9
        L15b:
            r9.closeEntry()     // Catch: java.lang.Throwable -> Le9
            goto Ldf
        L15f:
            java.io.File r7 = r11.getParentFile()     // Catch: java.lang.Throwable -> L215
            if (r7 == 0) goto L193
            boolean r17 = r7.exists()     // Catch: java.lang.Throwable -> Le9
            if (r17 != 0) goto L193
            boolean r17 = r7.mkdirs()     // Catch: java.lang.Throwable -> Le9
            if (r17 != 0) goto L193
            boolean r17 = r7.isDirectory()     // Catch: java.lang.Throwable -> Le9
            if (r17 == 0) goto L178
            goto L193
        L178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r1.<init>()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le9
            throw r0     // Catch: java.lang.Throwable -> Le9
        L193:
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L215
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L215
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L215
            r17 = r1
            r1 = 131072(0x20000, float:1.83671E-40)
            r7.<init>(r12, r1)     // Catch: java.lang.Throwable -> L215
        L1a1:
            int r12 = r9.read(r10)     // Catch: java.lang.Throwable -> L1ea
            r1 = -1
            if (r12 == r1) goto L1c3
            r1 = 0
            r7.write(r10, r1, r12)     // Catch: java.lang.Throwable -> L1ea
            r18 = r2
            long r1 = r4.bytes     // Catch: java.lang.Throwable -> L1ea
            r19 = r5
            r20 = r6
            long r5 = (long) r12
            long r1 = r1 + r5
            r4.bytes = r1     // Catch: java.lang.Throwable -> L1c1
            r2 = r18
            r5 = r19
            r6 = r20
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L1a1
        L1c1:
            r0 = move-exception
            goto L1ed
        L1c3:
            r18 = r2
            r19 = r5
            r20 = r6
            r7.close()     // Catch: java.lang.Throwable -> L213
            long r1 = r15.getTime()     // Catch: java.lang.Throwable -> L213
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1dd
            long r1 = r15.getTime()     // Catch: java.lang.Throwable -> L213
            r11.setLastModified(r1)     // Catch: java.lang.Throwable -> L213
        L1dd:
            int r1 = r4.files     // Catch: java.lang.Throwable -> L213
            int r1 = r1 + 1
            r4.files = r1     // Catch: java.lang.Throwable -> L213
            maybeNotifyRestore(r4, r0)     // Catch: java.lang.Throwable -> L213
            r9.closeEntry()     // Catch: java.lang.Throwable -> L213
            goto L206
        L1ea:
            r0 = move-exception
            r19 = r5
        L1ed:
            r1 = r0
            r7.close()     // Catch: java.lang.Throwable -> L1f2
            goto L1f7
        L1f2:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L213
        L1f7:
            throw r1     // Catch: java.lang.Throwable -> L213
        L1f8:
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r6
            drainEntry(r9, r10)     // Catch: java.lang.Throwable -> L213
            r9.closeEntry()     // Catch: java.lang.Throwable -> L213
        L206:
            r1 = r17
            r2 = r18
            r5 = r19
            r6 = r20
            r7 = 0
            r11 = 131072(0x20000, float:1.83671E-40)
            goto Lc8
        L213:
            r0 = move-exception
            goto L218
        L215:
            r0 = move-exception
            r19 = r5
        L218:
            r1 = r0
            r2 = r19
            goto L312
        L21d:
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r6
            r9.close()     // Catch: java.lang.Throwable -> L30b
            if (r8 == 0) goto L233
            r8.close()     // Catch: java.lang.Throwable -> L22e
            goto L233
        L22e:
            r0 = move-exception
            r2 = r19
            goto L33b
        L233:
            if (r13 == 0) goto L2fe
            if (r14 == 0) goto L2f1
            boolean r1 = r20.isDirectory()
            if (r1 == 0) goto L2f1
            boolean r1 = isDirectoryEmpty(r20)
            if (r1 != 0) goto L2f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Installing restored .minecraft into: "
            r1.<init>(r2)
            java.lang.String r2 = r18.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notify(r0, r1)
            boolean r1 = r18.exists()
            if (r1 == 0) goto L27e
            boolean r1 = isDirectoryEmpty(r18)
            if (r1 != 0) goto L27e
            boolean r1 = r3.exists()
            if (r1 == 0) goto L26e
            deleteRecursively(r3)
        L26e:
            java.lang.String r1 = "Saving previous .minecraft"
            r2 = r18
            copyDirectory(r2, r3, r0, r1)
            java.lang.String r7 = r3.getAbsolutePath()
            deleteChildren(r2)
            r6 = r7
            goto L2b0
        L27e:
            r2 = r18
            boolean r1 = r2.exists()
            if (r1 != 0) goto L2af
            boolean r1 = r2.mkdirs()
            if (r1 != 0) goto L2af
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L293
            goto L2af
        L293:
            deleteRecursively(r19)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create .minecraft folder: "
            r1.<init>(r3)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2af:
            r6 = 0
        L2b0:
            java.lang.String r1 = "Installing restored .minecraft"
            r3 = r20
            copyDirectory(r3, r2, r0, r1)
            r1 = r17
            r2 = r19
            restoreLauncherSideData(r2, r1, r0)
            deleteRecursively(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Restore complete: "
            r1.<init>(r2)
            int r2 = r4.files
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " files • "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.bytes
            java.lang.String r2 = formatBytes(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notify(r0, r1)
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreResult r0 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$RestoreResult
            int r3 = r4.files
            long r4 = r4.bytes
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7)
            return r0
        L2f1:
            r2 = r19
            deleteRecursively(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Selected file does not contain DroidBridge .minecraft data."
            r0.<init>(r1)
            throw r0
        L2fe:
            r2 = r19
            deleteRecursively(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Selected file is missing backup_manifest.json."
            r0.<init>(r1)
            throw r0
        L30b:
            r0 = move-exception
            r2 = r19
            goto L31e
        L30f:
            r0 = move-exception
            r2 = r5
            r1 = r0
        L312:
            r9.close()     // Catch: java.lang.Throwable -> L316
            goto L31b
        L316:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> L329
        L31b:
            throw r1     // Catch: java.lang.Throwable -> L329
        L31c:
            r0 = move-exception
            r2 = r5
        L31e:
            r1 = r0
            goto L32b
        L320:
            r2 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L329
            java.lang.String r1 = "Unable to open selected backup file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L329
            throw r0     // Catch: java.lang.Throwable -> L329
        L329:
            r0 = move-exception
            goto L31e
        L32b:
            if (r8 == 0) goto L336
            r8.close()     // Catch: java.lang.Throwable -> L331
            goto L336
        L331:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> L337
        L336:
            throw r1     // Catch: java.lang.Throwable -> L337
        L337:
            r0 = move-exception
            goto L33b
        L339:
            r0 = move-exception
            r2 = r5
        L33b:
            deleteRecursively(r2)
            throw r0
    }

    private static void restoreLauncherSideData(java.io.File r5, java.io.File r6, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r7) throws java.lang.Exception {
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L7
            return
        L7:
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L39
            r2 = r5[r1]
            java.lang.String r3 = ".minecraft"
            java.lang.String r4 = r2.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1a
            goto L36
        L1a:
            java.lang.String r3 = r2.getName()
            boolean r3 = isAllowedLauncherSidePath(r3)
            if (r3 != 0) goto L25
            goto L36
        L25:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r2.getName()
            r3.<init>(r6, r4)
            deleteRecursively(r3)
            java.lang.String r4 = "Installing launcher data"
            copyDirectory(r2, r3, r7, r4)
        L36:
            int r1 = r1 + 1
            goto L9
        L39:
            return
    }

    private static java.io.File safeResolveInside(java.io.File r3, java.lang.String r4) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r4)
            java.lang.String r3 = r3.getCanonicalPath()
            java.lang.String r1 = r0.getCanonicalPath()
            boolean r2 = r1.equals(r3)
            if (r2 != 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L2d
            goto L42
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Backup contains an unsafe path: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L42:
            return r0
    }

    private static boolean shouldSkip(java.io.File r2) {
            java.lang.String r2 = r2.getName()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.String r1 = ".download"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = ".tmp"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "tmp"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "temp"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = ".restore_tmp"
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = ".droidbridge_restore_tmp_"
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = ".before_restore_"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L47
        L46:
            r0 = 1
        L47:
            return r0
    }

    private static void writeManifest(android.content.Context r4, java.io.File r5, java.io.File r6, java.util.zip.ZipOutputStream r7) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            java.lang.String r2 = "droidbridge-backup"
            r0.put(r1, r2)
            java.lang.String r1 = "backupVersion"
            r2 = 3
            r0.put(r1, r2)
            java.lang.String r1 = "contentRoot"
            java.lang.String r2 = "minecraft-head"
            r0.put(r1, r2)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ssZ"
            java.util.Locale r3 = java.util.Locale.US
            r1.<init>(r2, r3)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r1 = r1.format(r2)
            java.lang.String r2 = "createdAt"
            r0.put(r2, r1)
            java.lang.String r1 = "packageName"
            java.lang.String r4 = r4.getPackageName()
            r0.put(r1, r4)
            java.lang.String r4 = "launcherHome"
            java.lang.String r5 = r5.getAbsolutePath()
            r0.put(r4, r5)
            java.lang.String r4 = "minecraftHome"
            java.lang.String r5 = r6.getAbsolutePath()
            r0.put(r4, r5)
            r4 = 2
            java.lang.String r4 = r0.toString(r4)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r5)
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry
            java.lang.String r6 = "backup_manifest.json"
            r5.<init>(r6)
            r7.putNextEntry(r5)
            r7.write(r4)
            r7.closeEntry()
            return
    }

    private static void zipDirectory(java.io.File r8, java.io.File r9, java.lang.String r10, java.util.zip.ZipOutputStream r11, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Counter r12, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r13) throws java.lang.Exception {
            java.io.File[] r9 = r9.listFiles()
            if (r9 != 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.Arrays.sort(r9, r0)
            int r0 = r9.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L3c
            r3 = r9[r1]
            boolean r2 = shouldSkip(r3)
            if (r2 == 0) goto L1c
            goto L39
        L1c:
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L2b
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            zipDirectory(r2, r3, r4, r5, r6, r7)
            goto L39
        L2b:
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L39
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            zipFile(r2, r3, r4, r5, r6, r7)
        L39:
            int r1 = r1 + 1
            goto L11
        L3c:
            return
    }

    private static void zipFile(java.io.File r3, java.io.File r4, java.lang.String r5, java.util.zip.ZipOutputStream r6, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Counter r7, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r8) throws java.lang.Exception {
            java.net.URI r3 = r3.toURI()
            java.net.URI r0 = r4.toURI()
            java.net.URI r3 = r3.relativize(r0)
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto Lbd
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            goto Lbd
        L1e:
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r5 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r5, r1)
            r0.<init>(r3)
            long r1 = r4.lastModified()
            r0.setTime(r1)
            r6.putNextEntry(r0)
            r3 = 131072(0x20000, float:1.83671E-40)
            byte[] r5 = new byte[r3]
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            r0.<init>(r1, r3)
        L54:
            int r3 = r0.read(r5)     // Catch: java.lang.Throwable -> Lb3
            r4 = -1
            if (r3 == r4) goto L66
            r4 = 0
            r6.write(r5, r4, r3)     // Catch: java.lang.Throwable -> Lb3
            long r1 = r7.bytes     // Catch: java.lang.Throwable -> Lb3
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb3
            long r1 = r1 + r3
            r7.bytes = r1     // Catch: java.lang.Throwable -> Lb3
            goto L54
        L66:
            r0.close()
            r6.closeEntry()
            int r3 = r7.files
            r4 = 1
            int r3 = r3 + r4
            r7.files = r3
            long r5 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto Lb2
            int r3 = r7.files
            if (r3 == r4) goto L8c
            int r3 = r7.files
            int r3 = r3 % 50
            if (r3 == 0) goto L8c
            long r3 = r7.lastUpdateMs
            long r3 = r5 - r3
            r0 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Lb2
        L8c:
            r7.lastUpdateMs = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Backing up "
            r3.<init>(r4)
            int r4 = r7.files
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " files • "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = r7.bytes
            java.lang.String r4 = formatBytes(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.onProgress(r3)
        Lb2:
            return
        Lb3:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r4 = move-exception
            r3.addSuppressed(r4)
        Lbc:
            throw r3
        Lbd:
            return
    }

    private static void zipLauncherSideDirectory(java.io.File r6, java.lang.String r7, java.util.zip.ZipOutputStream r8, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.Counter r9, ca.dnamobile.javalauncher.storage.DroidBridgeBackupManager.ProgressCallback r10) throws java.lang.Exception {
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r7)
            boolean r6 = r1.exists()
            if (r6 != 0) goto Lc
            return
        Lc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "launcher_data/"
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "/"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r2 = r6.toString()
            r0 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            zipDirectory(r0, r1, r2, r3, r4, r5)
            return
    }
}
