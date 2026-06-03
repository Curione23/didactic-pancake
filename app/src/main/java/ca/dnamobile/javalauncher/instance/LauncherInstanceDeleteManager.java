package ca.dnamobile.javalauncher.instance;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherInstanceDeleteManager {
    private static final java.lang.String PENDING_DELETE_DIR = ".pending_delete";
    private static final java.lang.String TAG = "InstanceDelete";

    public static final class DeleteJob {
        private final java.io.File deleteTarget;
        private final java.lang.String instanceId;
        private final boolean movedOutOfVisibleList;
        private final java.io.File originalTarget;

        /* JADX INFO: renamed from: -$$Nest$fgetinstanceId, reason: not valid java name */
        static /* bridge */ /* synthetic */ java.lang.String m485$$Nest$fgetinstanceId(ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob r0) {
                java.lang.String r0 = r0.instanceId
                return r0
        }

        private DeleteJob(java.lang.String r1, java.io.File r2, java.io.File r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.instanceId = r1
                r0.originalTarget = r2
                r0.deleteTarget = r3
                r0.movedOutOfVisibleList = r4
                return
        }

        /* synthetic */ DeleteJob(java.lang.String r1, java.io.File r2, java.io.File r3, boolean r4, ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJobIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public java.io.File getDeleteTarget() {
                r1 = this;
                java.io.File r0 = r1.deleteTarget
                return r0
        }

        public java.io.File getOriginalTarget() {
                r1 = this;
                java.io.File r0 = r1.originalTarget
                return r0
        }

        public boolean wasMovedOutOfVisibleList() {
                r1 = this;
                boolean r0 = r1.movedOutOfVisibleList
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class DeleteJobIA {
    }

    private LauncherInstanceDeleteManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.io.File buildTrashTarget(java.io.File r6, java.io.File r7, boolean r8) throws java.lang.Exception {
            if (r8 == 0) goto Le
            java.io.File r7 = r6.getParentFile()
            if (r7 == 0) goto Ld
            java.io.File r7 = r7.getParentFile()
            goto Le
        Ld:
            r7 = 0
        Le:
            if (r7 == 0) goto L88
            java.io.File r0 = new java.io.File
            java.io.File r7 = r7.getCanonicalFile()
            java.lang.String r1 = ".pending_delete"
            r0.<init>(r7, r1)
            if (r8 == 0) goto L20
            java.lang.String r7 = "instance-"
            goto L22
        L20:
            java.lang.String r7 = "version-"
        L22:
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r6 = r6.replaceAll(r8, r1)
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.<init>(r0, r1)
            r1 = 2
        L53:
            boolean r3 = r8.exists()
            if (r3 == 0) goto L87
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            int r4 = r1 + 1
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r8.<init>(r0, r1)
            r1 = r4
            goto L53
        L87:
            return r8
        L88:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unable to resolve Minecraft home for delete staging."
            r6.<init>(r7)
            throw r6
    }

    private static void cleanupPendingDeletes(java.io.File r7) {
            if (r7 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".pending_delete"
            r0.<init>(r7, r1)
            boolean r7 = r0.isDirectory()
            if (r7 != 0) goto L11
            return
        L11:
            java.io.File[] r7 = r0.listFiles()
            if (r7 != 0) goto L18
            return
        L18:
            int r1 = r7.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L4c
            r3 = r7[r2]
            deleteRecursively(r3)     // Catch: java.lang.Throwable -> L22
            goto L49
        L22:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to cleanup pending delete "
            r5.<init>(r6)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = ": "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = readableError(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InstanceDelete"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
        L49:
            int r2 = r2 + 1
            goto L1a
        L4c:
            r0.delete()
            return
    }

    public static void cleanupPendingDeletesAsync(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.lang.String r2 = "Cleanup Pending Instance Deletes"
            r0.<init>(r1, r2)
            r0.start()
            return
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

    private static void ensureSharedVersionIsNotRequired(android.content.Context r3, java.lang.String r4) {
            java.util.ArrayList r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findSharedVersionDependents(r3, r4)
            java.util.ArrayList r3 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findIsolatedInstanceDependents(r3, r4)
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
            java.lang.String r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.formatDependentVersionList(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = "\nDelete those instances/loader versions first, or keep this shared version installed."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static void finishDeletion(android.content.Context r3, ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob r4) throws java.lang.Exception {
            java.lang.String r0 = "InstanceDelete"
            java.lang.String r1 = "Deleted scoped-storage copy for instance "
            java.io.File r2 = r4.getDeleteTarget()
            deleteRecursively(r2)
            java.io.File r2 = r4.getOriginalTarget()     // Catch: java.lang.Throwable -> L62
            boolean r3 = ca.dnamobile.javalauncher.storage.StorageLocationStore.deleteFromScopedStorageIfNeeded(r3, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = " at "
            if (r3 == 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob.m485$$Nest$fgetinstanceId(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: java.lang.Throwable -> L62
            java.io.File r1 = r4.getOriginalTarget()     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L62
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)     // Catch: java.lang.Throwable -> L62
        L3b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Finished deleting instance "
            r3.<init>(r1)
            java.lang.String r1 = ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob.m485$$Nest$fgetinstanceId(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.io.File r4 = r4.getOriginalTarget()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)
            return
        L62:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete scoped-storage copy for instance "
            r1.<init>(r2)
            java.lang.String r4 = ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob.m485$$Nest$fgetinstanceId(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r3)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Local instance was removed, but the scoped-storage copy could not be deleted: "
            r0.<init>(r1)
            java.lang.String r1 = readableError(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            throw r4
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob hideForDeletion(android.content.Context r3, ca.dnamobile.javalauncher.instance.LauncherInstance r4) throws java.lang.Exception {
            java.lang.String r0 = r4.getId()
            java.lang.String r1 = r4.getBaseVersionId()
            java.io.File r2 = r4.getRootDirectory()
            boolean r4 = r4.isIsolated()
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob r3 = hideForDeletion(r3, r0, r1, r2, r4)
            return r3
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager.DeleteJob hideForDeletion(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.io.File r10, boolean r11) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r7)
            java.io.File r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.getDeleteTargetDirectory(r9, r10, r11)
            java.io.File r4 = r0.getCanonicalFile()
            validateDeleteTarget(r7, r4, r9, r10, r11)
            boolean r7 = r4.exists()
            if (r7 != 0) goto L1f
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob r7 = new ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob
            r5 = 1
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L1f:
            java.io.File r7 = buildTrashTarget(r4, r10, r11)
            java.io.File r9 = r7.getParentFile()
            if (r9 == 0) goto Lac
            boolean r10 = r9.exists()
            if (r10 != 0) goto L4f
            boolean r10 = r9.mkdirs()
            if (r10 == 0) goto L36
            goto L4f
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to create delete staging folder: "
            r8.<init>(r10)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L4f:
            boolean r9 = r4.renameTo(r7)
            java.lang.String r10 = "InstanceDelete"
            if (r9 == 0) goto L8b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Moved instance out of visible list: "
            r9.<init>(r11)
            java.lang.String r11 = r4.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = " -> "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = r7.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r10, r9)
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob r9 = new ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob
            java.io.File r7 = r7.getCanonicalFile()
            r5 = 1
            r6 = 0
            r1 = r9
            r2 = r8
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r9
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to move instance before delete, falling back to direct delete: "
            r7.<init>(r9)
            java.lang.String r9 = r4.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r10, r7)
            ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob r7 = new ca.dnamobile.javalauncher.instance.LauncherInstanceDeleteManager$DeleteJob
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        Lac:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Missing delete staging parent for: "
            r9.<init>(r10)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
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

    static /* synthetic */ void lambda$cleanupPendingDeletesAsync$0(android.content.Context r2) {
            java.util.List r2 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getAllMinecraftHomes(r2)     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L18
        L8:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L18
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L18
            cleanupPendingDeletes(r0)     // Catch: java.lang.Throwable -> L18
            goto L8
        L18:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pending delete cleanup failed: "
            r0.<init>(r1)
            java.lang.String r2 = readableError(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "InstanceDelete"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
        L31:
            return
    }

    private static java.lang.String readableError(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
        L10:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = r2.getSimpleName()
        L18:
            return r0
    }

    private static void validateDeleteTarget(android.content.Context r1, java.io.File r2, java.lang.String r3, java.io.File r4, boolean r5) throws java.lang.Exception {
            if (r5 == 0) goto L3f
            java.io.File r1 = r4.getParentFile()
            if (r1 == 0) goto L11
            java.io.File r1 = r4.getParentFile()
            java.io.File r1 = r1.getCanonicalFile()
            goto L19
        L11:
            java.io.File r1 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.getInstancesRoot()
            java.io.File r1 = r1.getCanonicalFile()
        L19:
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L26
            boolean r1 = isChildOf(r1, r2)
            if (r1 == 0) goto L26
            return
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Refusing to delete unsafe instance path: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3f:
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "versions"
            r5.<init>(r4, r0)
            java.io.File r4 = r5.getCanonicalFile()
            java.io.File r5 = r2.getParentFile()
            if (r5 == 0) goto L59
            java.io.File r5 = r2.getParentFile()
            java.io.File r5 = r5.getCanonicalFile()
            goto L5a
        L59:
            r5 = 0
        L5a:
            if (r5 == 0) goto L66
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L66
            ensureSharedVersionIsNotRequired(r1, r3)
            return
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Refusing to delete unsafe shared version path: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
