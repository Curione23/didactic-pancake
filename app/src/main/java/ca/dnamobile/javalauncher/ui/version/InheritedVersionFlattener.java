package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class InheritedVersionFlattener {
    private static final java.lang.String JSON_FLATTENED_FIELD = "javaLauncherFlattened";
    private static final java.lang.String JSON_PARENT_FIELD = "javaLauncherFlattenedParent";
    private static final java.lang.String METADATA_DIR_NAME = "JavaLauncher";
    private static final java.lang.String PARENT_MARKER_FILE_NAME = "flattened_parent.txt";
    private static final java.lang.String TAG = "InheritedFlattener";

    public static final class FlattenResult {
        public final boolean copiedClientJar;
        public final boolean flattened;
        public final java.lang.String parentVersionId;

        private FlattenResult(boolean r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.flattened = r1
                r0.parentVersionId = r2
                r0.copiedClientJar = r3
                return
        }

        /* synthetic */ FlattenResult(boolean r1, java.lang.String r2, boolean r3, ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.FlattenResultIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class FlattenResultIA {
    }

    public static final class ParentDeleteResult {
        public final boolean deleted;
        public final java.lang.String message;
        public final java.lang.String parentVersionId;

        private ParentDeleteResult(boolean r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.deleted = r1
                r0.parentVersionId = r2
                r0.message = r3
                return
        }

        /* synthetic */ ParentDeleteResult(boolean r1, java.lang.String r2, java.lang.String r3, ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.ParentDeleteResultIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ParentDeleteResultIA {
    }

    private InheritedVersionFlattener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void assertChildOf(java.io.File r2, java.io.File r3, java.lang.String r4) throws java.lang.Exception {
            java.io.File r2 = r2.getCanonicalFile()
            java.io.File r3 = r3.getCanonicalFile()
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L2a
            return
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r4 = "Refusing unsafe %s path outside versions root: %s"
            java.lang.String r3 = java.lang.String.format(r0, r4, r3)
            r2.<init>(r3)
            throw r2
    }

    private static void copyFile(java.io.File r7, java.io.File r8) throws java.lang.Exception {
            java.io.File r0 = r8.getParentFile()
            if (r0 == 0) goto L9
            ensureDirectory(r0)
        L9:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".part"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r7)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            r2 = 65536(0x10000, float:9.1835E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> La6
        L33:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> La6
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L3f
            r7.write(r3, r5, r4)     // Catch: java.lang.Throwable -> La6
            goto L33
        L3f:
            r7.close()     // Catch: java.lang.Throwable -> Lb0
            r1.close()
            boolean r7 = r8.exists()
            if (r7 == 0) goto L6b
            boolean r7 = r8.delete()
            if (r7 == 0) goto L52
            goto L6b
        L52:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to replace file: "
            r0.<init>(r1)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6b:
            boolean r7 = r0.renameTo(r8)
            if (r7 != 0) goto La5
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r0)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L9b
            byte[] r8 = new byte[r2]     // Catch: java.lang.Throwable -> L91
        L7d:
            int r2 = r7.read(r8)     // Catch: java.lang.Throwable -> L91
            if (r2 == r6) goto L87
            r1.write(r8, r5, r2)     // Catch: java.lang.Throwable -> L91
            goto L7d
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L9b
            r7.close()
            r0.delete()
            goto La5
        L91:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L9b
        L9a:
            throw r8     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r7 = move-exception
            r8.addSuppressed(r7)
        La4:
            throw r8
        La5:
            return
        La6:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> Lab
            goto Laf
        Lab:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r8     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        Lb5:
            r8 = move-exception
            r7.addSuppressed(r8)
        Lb9:
            throw r7
    }

    private static void deleteDirectory(java.io.File r5) throws java.lang.Exception {
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L3f
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L3f
            r3 = r0[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L16
            deleteDirectory(r3)
            goto L3c
        L16:
            boolean r4 = r3.exists()
            if (r4 == 0) goto L3c
            boolean r4 = r3.delete()
            if (r4 == 0) goto L23
            goto L3c
        L23:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to delete file: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3c:
            int r2 = r2 + 1
            goto L8
        L3f:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L65
            boolean r0 = r5.delete()
            if (r0 == 0) goto L4c
            goto L65
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete directory: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L65:
            return
    }

    public static ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.ParentDeleteResult deleteFlattenedParentVersionIfSafe(android.content.Context r9, java.lang.String r10) throws java.lang.Exception {
            ensureActivePathManager(r9)
            java.lang.String r9 = readFlattenedParentId(r9, r10)
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L144
            java.lang.String r2 = r9.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L17
            goto L144
        L17:
            java.lang.String r9 = r9.trim()
            java.io.File r2 = getVersionsRoot()
            java.io.File r2 = r2.getCanonicalFile()
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r10)
            java.io.File r3 = r3.getCanonicalFile()
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r6 = ".json"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r3, r5)
            boolean r5 = r4.isFile()
            if (r5 != 0) goto L52
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r2 = "Flattened child JSON is missing."
            r10.<init>(r0, r9, r2, r1)
            return r10
        L52:
            org.json.JSONObject r5 = new org.json.JSONObject
            java.lang.String r4 = readString(r4)
            r5.<init>(r4)
            java.lang.String r4 = "inheritsFrom"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.optString(r4, r7)
            java.lang.String r5 = r5.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L75
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r2 = "Child still inherits from parent."
            r10.<init>(r0, r9, r2, r1)
            return r10
        L75:
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r9)
            java.io.File r5 = r5.getCanonicalFile()
            boolean r8 = r10.equals(r9)
            if (r8 != 0) goto L13c
            boolean r8 = r3.equals(r5)
            if (r8 == 0) goto L8c
            goto L13c
        L8c:
            boolean r8 = r5.isDirectory()
            if (r8 != 0) goto L9d
            deleteParentMarker(r3)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r2 = "Parent version is already gone."
            r10.<init>(r0, r9, r2, r1)
            return r10
        L9d:
            java.lang.String r8 = "parent version"
            assertChildOf(r2, r5, r8)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            r2.<init>(r5, r6)
            boolean r6 = r2.isFile()
            if (r6 == 0) goto Ldd
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r2 = readString(r2)
            r6.<init>(r2)
            java.lang.String r2 = r6.optString(r4, r7)
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ldd
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r2 = "Parent is not a standalone vanilla profile."
            r10.<init>(r0, r9, r2, r1)
            return r10
        Ldd:
            java.util.HashSet r2 = findDirectInheritors(r9, r10)
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Lfc
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parent kept because other installed versions still inherit from it: "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r10.<init>(r0, r9, r2, r1)
            return r10
        Lfc:
            deleteDirectory(r5)
            deleteParentMarker(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Deleted flattened parent version "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r2 = " after flattening "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "InheritedFlattener"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Deleted flattened parent "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r2 = "."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            r10.<init>(r2, r9, r0, r1)
            return r10
        L13c:
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r10 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r2 = "Refusing to delete the active child version."
            r10.<init>(r0, r9, r2, r1)
            return r10
        L144:
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r9 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult
            java.lang.String r10 = "No flattened parent marker found."
            r9.<init>(r0, r1, r10, r1)
            return r9
    }

    private static void deleteParentMarker(java.io.File r4) {
            java.lang.String r0 = "Unable to delete parent marker: "
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L32
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "JavaLauncher"
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "flattened_parent.txt"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L32
            boolean r4 = r1.exists()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L32
            boolean r4 = r1.delete()     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L32
            java.lang.String r4 = "InheritedFlattener"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r0)     // Catch: java.lang.Throwable -> L32
        L32:
            return
    }

    private static void ensureActivePathManager(android.content.Context r1) {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L10
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        L10:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
        L13:
            return
    }

    private static void ensureDirectory(java.io.File r3) throws java.lang.Exception {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L26
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Path exists but is not a directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L26:
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L33
            goto L4c
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L4c:
            return
    }

    private static java.util.HashSet<java.lang.String> findDirectInheritors(java.lang.String r9, java.lang.String r10) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.io.File r1 = getVersionsRoot()
            java.io.File[] r1 = r1.listFiles()
            if (r1 != 0) goto L10
            return r0
        L10:
            int r2 = r1.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L9a
            r4 = r1[r3]
            boolean r5 = r4.isDirectory()
            if (r5 != 0) goto L1e
            goto L96
        L1e:
            java.lang.String r5 = r4.getName()
            boolean r6 = r9.equals(r5)
            if (r6 != 0) goto L96
            boolean r6 = r10.equals(r5)
            if (r6 == 0) goto L2f
            goto L96
        L2f:
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = ".json"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r4, r7)
            boolean r4 = r6.isFile()
            if (r4 != 0) goto L4e
            goto L96
        L4e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = readString(r6)     // Catch: java.lang.Throwable -> L73
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "inheritsFrom"
            java.lang.String r7 = ""
            java.lang.String r6 = r4.optString(r6, r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L73
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L96
            java.lang.String r6 = "id"
            java.lang.String r4 = r4.optString(r6, r5)     // Catch: java.lang.Throwable -> L73
            r0.add(r4)     // Catch: java.lang.Throwable -> L73
            goto L96
        L73:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to inspect version inherit link for "
            r6.<init>(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = ": "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "InheritedFlattener"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
        L96:
            int r3 = r3 + 1
            goto L12
        L9a:
            return r0
    }

    public static ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.FlattenResult flattenInstalledVersionProfile(android.content.Context r12, java.lang.String r13) throws java.lang.Exception {
            ensureActivePathManager(r12)
            java.io.File r0 = getVersionsRoot()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r13)
            java.io.File r1 = r1.getCanonicalFile()
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.String r4 = ".json"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L15e
            org.json.JSONObject r3 = new org.json.JSONObject
            java.lang.String r5 = readString(r2)
            r3.<init>(r5)
            java.lang.String r5 = "inheritsFrom"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.optString(r5, r6)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L55
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult r0 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult
            java.lang.String r12 = readFlattenedParentId(r12, r13)
            r0.<init>(r8, r12, r8, r7)
            return r0
        L55:
            boolean r12 = r13.equals(r5)
            if (r12 != 0) goto L149
            java.io.File r12 = new java.io.File
            r12.<init>(r0, r5)
            java.io.File r12 = r12.getCanonicalFile()
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.StringBuilder r4 = r9.append(r4)
            java.lang.String r4 = r4.toString()
            r6.<init>(r12, r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.String r10 = ".jar"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.<init>(r12, r9)
            java.io.File r9 = r0.getCanonicalFile()
            java.lang.String r11 = "child version"
            assertChildOf(r9, r1, r11)
            java.io.File r0 = r0.getCanonicalFile()
            java.lang.String r9 = "parent version"
            assertChildOf(r0, r12, r9)
            boolean r12 = r6.isFile()
            if (r12 == 0) goto L130
            boolean r12 = r4.isFile()
            if (r12 == 0) goto L117
            org.json.JSONObject r12 = new org.json.JSONObject
            java.lang.String r0 = readString(r6)
            r12.<init>(r0)
            org.json.JSONObject r12 = mergeVersionJson(r12, r3, r13, r5)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r3 = r3.toString()
            r0.<init>(r1, r3)
            boolean r3 = r0.isFile()
            r6 = 1
            if (r3 != 0) goto Lde
            copyFile(r4, r0)
            r8 = r6
        Lde:
            r0 = 2
            java.lang.String r12 = r12.toString(r0)
            writeString(r2, r12)
            writeParentMarker(r1, r5)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Flattened "
            r12.<init>(r0)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r13 = " inherited from "
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r12 = r12.append(r5)
            java.lang.String r13 = ", copiedClientJar="
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r12 = r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "InheritedFlattener"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r13, r12)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult r12 = new ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult
            r12.<init>(r6, r5, r8, r7)
            return r12
        L117:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Parent client jar not found: "
            r13.<init>(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L130:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Parent version JSON not found: "
            r13.<init>(r0)
            java.lang.String r0 = r6.getAbsolutePath()
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L149:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Refusing to flatten a version that inherits from itself: "
            r0.<init>(r1)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L15e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Child version JSON not found: "
            r13.<init>(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    private static java.io.File getVersionsRoot() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "versions"
            r0.<init>(r1, r2)
            return r0
    }

    private static java.lang.String libraryMergeKey(org.json.JSONObject r6) {
            java.lang.String r0 = "name"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "missing-name-"
            r0.<init>(r1)
            java.lang.String r6 = r6.toString()
            int r6 = r6.hashCode()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            return r6
        L26:
            java.lang.String r6 = ":"
            java.lang.String[] r2 = r0.split(r6)
            int r3 = r2.length
            r4 = 3
            if (r3 >= r4) goto L31
            return r0
        L31:
            r0 = 0
            r0 = r2[r0]
            r3 = 1
            r3 = r2[r3]
            int r5 = r2.length
            if (r5 <= r4) goto L3c
            r1 = r2[r4]
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private static org.json.JSONObject mergeArguments(org.json.JSONObject r6, org.json.JSONObject r7) throws java.lang.Exception {
            if (r6 != 0) goto La
            if (r7 != 0) goto La
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            return r6
        La:
            if (r6 != 0) goto L16
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            return r6
        L16:
            if (r7 != 0) goto L22
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            return r7
        L22:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            org.json.JSONArray r1 = r7.names()
            if (r1 == 0) goto L67
            r2 = 0
        L32:
            int r3 = r1.length()
            if (r2 >= r3) goto L67
            java.lang.String r3 = r1.getString(r2)
            java.lang.String r4 = "game"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L55
            java.lang.String r4 = "jvm"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L4d
            goto L55
        L4d:
            java.lang.Object r4 = r7.get(r3)
            r0.put(r3, r4)
            goto L64
        L55:
            org.json.JSONArray r4 = r6.optJSONArray(r3)
            org.json.JSONArray r5 = r7.optJSONArray(r3)
            org.json.JSONArray r4 = mergeArrays(r4, r5)
            r0.put(r3, r4)
        L64:
            int r2 = r2 + 1
            goto L32
        L67:
            return r0
    }

    private static org.json.JSONArray mergeArrays(org.json.JSONArray r4, org.json.JSONArray r5) throws java.lang.Exception {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L19
            r2 = r1
        L9:
            int r3 = r4.length()
            if (r2 >= r3) goto L19
            java.lang.Object r3 = r4.get(r2)
            r0.put(r3)
            int r2 = r2 + 1
            goto L9
        L19:
            if (r5 == 0) goto L2b
        L1b:
            int r4 = r5.length()
            if (r1 >= r4) goto L2b
            java.lang.Object r4 = r5.get(r1)
            r0.put(r4)
            int r1 = r1 + 1
            goto L1b
        L2b:
            return r0
    }

    private static org.json.JSONArray mergeLibraries(org.json.JSONArray r6, org.json.JSONArray r7) throws java.lang.Exception {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
            if (r6 == 0) goto L29
            r2 = r1
        L9:
            int r3 = r6.length()
            if (r2 >= r3) goto L29
            org.json.JSONObject r3 = r6.optJSONObject(r2)
            if (r3 != 0) goto L16
            goto L26
        L16:
            java.lang.String r4 = libraryMergeKey(r3)
            org.json.JSONObject r5 = new org.json.JSONObject
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            r0.put(r4, r5)
        L26:
            int r2 = r2 + 1
            goto L9
        L29:
            if (r7 == 0) goto L4b
        L2b:
            int r6 = r7.length()
            if (r1 >= r6) goto L4b
            org.json.JSONObject r6 = r7.optJSONObject(r1)
            if (r6 != 0) goto L38
            goto L48
        L38:
            java.lang.String r2 = libraryMergeKey(r6)
            org.json.JSONObject r3 = new org.json.JSONObject
            java.lang.String r6 = r6.toString()
            r3.<init>(r6)
            r0.put(r2, r3)
        L48:
            int r1 = r1 + 1
            goto L2b
        L4b:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r6.put(r0)
            goto L58
        L6c:
            return r6
    }

    private static org.json.JSONObject mergeVersionJson(org.json.JSONObject r8, org.json.JSONObject r9, java.lang.String r10, java.lang.String r11) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            org.json.JSONArray r1 = r9.names()
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r3 = "arguments"
            java.lang.String r4 = "libraries"
            if (r1 == 0) goto L3d
            r5 = 0
        L16:
            int r6 = r1.length()
            if (r5 >= r6) goto L3d
            java.lang.String r6 = r1.getString(r5)
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L3a
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L3a
            boolean r7 = r2.equals(r6)
            if (r7 == 0) goto L33
            goto L3a
        L33:
            java.lang.Object r7 = r9.get(r6)
            r0.put(r6, r7)
        L3a:
            int r5 = r5 + 1
            goto L16
        L3d:
            java.lang.String r1 = "id"
            r0.put(r1, r10)
            r0.remove(r2)
            java.lang.String r10 = "javaLauncherFlattened"
            r1 = 1
            r0.put(r10, r1)
            java.lang.String r10 = "javaLauncherFlattenedParent"
            r0.put(r10, r11)
            org.json.JSONArray r10 = r8.optJSONArray(r4)
            org.json.JSONArray r11 = r9.optJSONArray(r4)
            org.json.JSONArray r10 = mergeLibraries(r10, r11)
            r0.put(r4, r10)
            org.json.JSONObject r10 = r8.optJSONObject(r3)
            org.json.JSONObject r11 = r9.optJSONObject(r3)
            org.json.JSONObject r10 = mergeArguments(r10, r11)
            r0.put(r3, r10)
            java.lang.String r10 = "minecraftArguments"
            boolean r11 = r9.has(r10)
            java.lang.String r1 = ""
            if (r11 == 0) goto L80
            java.lang.String r8 = r9.optString(r10, r1)
            r0.put(r10, r8)
            goto L8d
        L80:
            boolean r9 = r8.has(r10)
            if (r9 == 0) goto L8d
            java.lang.String r8 = r8.optString(r10, r1)
            r0.put(r10, r8)
        L8d:
            return r0
    }

    public static java.lang.String readFlattenedParentId(android.content.Context r3, java.lang.String r4) {
            ensureActivePathManager(r3)     // Catch: java.lang.Throwable -> L69
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L69
            java.io.File r0 = getVersionsRoot()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L69
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L69
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "JavaLauncher"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "flattened_parent.txt"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L69
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L2f
            java.lang.String r0 = readString(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L69
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L2f
            return r0
        L2f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L69
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L69
            boolean r3 = r0.isFile()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L8c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = readString(r0)     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "javaLauncherFlattenedParent"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L69
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r4 != 0) goto L8c
            return r3
        L69:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to read flattened parent marker for "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InheritedFlattener"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
        L8c:
            r3 = 0
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

    private static void writeParentMarker(java.io.File r2, java.lang.String r3) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "JavaLauncher"
            r0.<init>(r2, r1)
            ensureDirectory(r0)
            java.io.File r2 = new java.io.File
            java.lang.String r1 = "flattened_parent.txt"
            r2.<init>(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            writeString(r2, r3)
            return
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
