package ca.dnamobile.javalauncher.feature.unpack;

/* JADX INFO: loaded from: classes.dex */
public class UnpackSingleFilesTask implements java.lang.Runnable {
    private final android.content.Context context;

    public UnpackSingleFilesTask(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            return
    }

    private static void ensureFile(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L33
            boolean r1 = r0.exists()
            if (r1 != 0) goto L33
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L1a
            goto L33
        L1a:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L33:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L45
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L45
            r0.write(r2)     // Catch: java.lang.Throwable -> L45
            r0.close()
            return
        L45:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r2.addSuppressed(r3)
        L4e:
            throw r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            android.content.Context r0 = r3.context     // Catch: java.lang.Throwable -> L18
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)     // Catch: java.lang.Throwable -> L18
            android.content.Context r0 = r3.context     // Catch: java.io.IOException -> Lb java.lang.Throwable -> L18
            ca.dnamobile.javalauncher.utils.CopyDefaultFromAssets.copyFromAssets(r0)     // Catch: java.io.IOException -> Lb java.lang.Throwable -> L18
            goto L20
        Lb:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.FILE_CTRLDEF_FILE     // Catch: java.lang.Throwable -> L18
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "{}\n"
            ensureFile(r0, r1)     // Catch: java.lang.Throwable -> L18
            goto L20
        L18:
            r0 = move-exception
            java.lang.String r1 = "UnpackSingleFiles"
            java.lang.String r2 = "Failed to prepare single files"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L20:
            return
    }
}
