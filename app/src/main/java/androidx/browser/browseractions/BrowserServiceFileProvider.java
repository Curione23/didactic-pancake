package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class BrowserServiceFileProvider extends androidx.core.content.FileProvider {
    private static final java.lang.String AUTHORITY_SUFFIX = ".image_provider";
    private static final java.lang.String CLIP_DATA_LABEL = "image_provider_uris";
    private static final java.lang.String CONTENT_SCHEME = "content";
    private static final java.lang.String FILE_EXTENSION = ".png";
    private static final java.lang.String FILE_SUB_DIR = "image_provider";
    private static final java.lang.String FILE_SUB_DIR_NAME = "image_provider_images/";
    private static final java.lang.String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    private static final java.lang.String TAG = "BrowserServiceFP";
    static java.lang.Object sFileCleanupLock;


    private static class FileCleanupTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private static final long CLEANUP_REQUIRED_TIME_SPAN = 0;
        private static final long DELETION_FAILED_REATTEMPT_DURATION = 0;
        private static final long IMAGE_RETENTION_DURATION = 0;
        private final android.content.Context mAppContext;

        static {
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
                r1 = 7
                long r3 = r0.toMillis(r1)
                androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.IMAGE_RETENTION_DURATION = r3
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
                long r0 = r0.toMillis(r1)
                androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.CLEANUP_REQUIRED_TIME_SPAN = r0
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
                r1 = 1
                long r0 = r0.toMillis(r1)
                androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.DELETION_FAILED_REATTEMPT_DURATION = r0
                return
        }

        FileCleanupTask(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.mAppContext = r1
                return
        }

        private static boolean isImageFile(java.io.File r1) {
                java.lang.String r1 = r1.getName()
                java.lang.String r0 = "..png"
                boolean r1 = r1.endsWith(r0)
                return r1
        }

        private static boolean shouldCleanUp(android.content.SharedPreferences r6) {
                java.lang.String r0 = "last_cleanup_time"
                long r1 = java.lang.System.currentTimeMillis()
                long r0 = r6.getLong(r0, r1)
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.CLEANUP_REQUIRED_TIME_SPAN
                long r0 = r0 + r4
                int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r6 <= 0) goto L17
                r6 = 1
                goto L18
            L17:
                r6 = 0
            L18:
                return r6
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Void r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected java.lang.Void doInBackground2(java.lang.Void... r13) {
                r12 = this;
                android.content.Context r13 = r12.mAppContext
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.content.Context r1 = r12.mAppContext
                java.lang.String r1 = r1.getPackageName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ".image_provider"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                android.content.SharedPreferences r13 = r13.getSharedPreferences(r0, r1)
                boolean r0 = shouldCleanUp(r13)
                r2 = 0
                if (r0 != 0) goto L28
                return r2
            L28:
                java.lang.Object r0 = androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock
                monitor-enter(r0)
                java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> La6
                android.content.Context r4 = r12.mAppContext     // Catch: java.lang.Throwable -> La6
                java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> La6
                java.lang.String r5 = "image_provider"
                r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> La6
                boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> La6
                if (r4 != 0) goto L40
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
                return r2
            L40:
                java.io.File[] r3 = r3.listFiles()     // Catch: java.lang.Throwable -> La6
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La6
                long r6 = androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.IMAGE_RETENTION_DURATION     // Catch: java.lang.Throwable -> La6
                long r4 = r4 - r6
                int r6 = r3.length     // Catch: java.lang.Throwable -> La6
                r7 = 1
                r8 = r1
            L4e:
                if (r8 >= r6) goto L87
                r9 = r3[r8]     // Catch: java.lang.Throwable -> La6
                boolean r10 = isImageFile(r9)     // Catch: java.lang.Throwable -> La6
                if (r10 != 0) goto L59
                goto L84
            L59:
                long r10 = r9.lastModified()     // Catch: java.lang.Throwable -> La6
                int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r10 >= 0) goto L84
                boolean r10 = r9.delete()     // Catch: java.lang.Throwable -> La6
                if (r10 != 0) goto L84
                java.lang.String r7 = "BrowserServiceFP"
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
                r10.<init>()     // Catch: java.lang.Throwable -> La6
                java.lang.String r11 = "Fail to delete image: "
                java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> La6
                java.io.File r9 = r9.getAbsoluteFile()     // Catch: java.lang.Throwable -> La6
                java.lang.StringBuilder r9 = r10.append(r9)     // Catch: java.lang.Throwable -> La6
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La6
                android.util.Log.e(r7, r9)     // Catch: java.lang.Throwable -> La6
                r7 = r1
            L84:
                int r8 = r8 + 1
                goto L4e
            L87:
                if (r7 == 0) goto L8e
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La6
                goto L98
            L8e:
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La6
                long r5 = androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.CLEANUP_REQUIRED_TIME_SPAN     // Catch: java.lang.Throwable -> La6
                long r3 = r3 - r5
                long r5 = androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask.DELETION_FAILED_REATTEMPT_DURATION     // Catch: java.lang.Throwable -> La6
                long r3 = r3 + r5
            L98:
                android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch: java.lang.Throwable -> La6
                java.lang.String r1 = "last_cleanup_time"
                r13.putLong(r1, r3)     // Catch: java.lang.Throwable -> La6
                r13.apply()     // Catch: java.lang.Throwable -> La6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
                return r2
            La6:
                r13 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
                throw r13
        }
    }

    private static class FileSaveTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Void> {
        private final android.content.Context mAppContext;
        private final android.graphics.Bitmap mBitmap;
        private final android.net.Uri mFileUri;
        private final java.lang.String mFilename;
        private final androidx.concurrent.futures.ResolvableFuture<android.net.Uri> mResultFuture;

        FileSaveTask(android.content.Context r1, java.lang.String r2, android.graphics.Bitmap r3, android.net.Uri r4, androidx.concurrent.futures.ResolvableFuture<android.net.Uri> r5) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.mAppContext = r1
                r0.mFilename = r2
                r0.mBitmap = r3
                r0.mFileUri = r4
                r0.mResultFuture = r5
                return
        }

        private void saveFileBlocking(java.io.File r5) {
                r4 = this;
                androidx.core.util.AtomicFile r0 = new androidx.core.util.AtomicFile
                r0.<init>(r5)
                java.io.FileOutputStream r5 = r0.startWrite()     // Catch: java.io.IOException -> L22
                android.graphics.Bitmap r1 = r4.mBitmap     // Catch: java.io.IOException -> L20
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.io.IOException -> L20
                r3 = 100
                r1.compress(r2, r3, r5)     // Catch: java.io.IOException -> L20
                r5.close()     // Catch: java.io.IOException -> L20
                r0.finishWrite(r5)     // Catch: java.io.IOException -> L20
                androidx.concurrent.futures.ResolvableFuture<android.net.Uri> r1 = r4.mResultFuture     // Catch: java.io.IOException -> L20
                android.net.Uri r2 = r4.mFileUri     // Catch: java.io.IOException -> L20
                r1.set(r2)     // Catch: java.io.IOException -> L20
                goto L2c
            L20:
                r1 = move-exception
                goto L24
            L22:
                r1 = move-exception
                r5 = 0
            L24:
                r0.failWrite(r5)
                androidx.concurrent.futures.ResolvableFuture<android.net.Uri> r5 = r4.mResultFuture
                r5.setException(r1)
            L2c:
                return
        }

        private void saveFileIfNeededBlocking() {
                r5 = this;
                java.io.File r0 = new java.io.File
                android.content.Context r1 = r5.mAppContext
                java.io.File r1 = r1.getFilesDir()
                java.lang.String r2 = "image_provider"
                r0.<init>(r1, r2)
                java.lang.Object r1 = androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock
                monitor-enter(r1)
                boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L5e
                if (r2 != 0) goto L2a
                boolean r2 = r0.mkdir()     // Catch: java.lang.Throwable -> L5e
                if (r2 != 0) goto L2a
                androidx.concurrent.futures.ResolvableFuture<android.net.Uri> r0 = r5.mResultFuture     // Catch: java.lang.Throwable -> L5e
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e
                java.lang.String r3 = "Could not create file directory."
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L5e
                r0.setException(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                return
            L2a:
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L5e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
                r3.<init>()     // Catch: java.lang.Throwable -> L5e
                java.lang.String r4 = r5.mFilename     // Catch: java.lang.Throwable -> L5e
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
                java.lang.String r4 = ".png"
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L5e
                boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L5e
                if (r0 == 0) goto L52
                androidx.concurrent.futures.ResolvableFuture<android.net.Uri> r0 = r5.mResultFuture     // Catch: java.lang.Throwable -> L5e
                android.net.Uri r3 = r5.mFileUri     // Catch: java.lang.Throwable -> L5e
                r0.set(r3)     // Catch: java.lang.Throwable -> L5e
                goto L55
            L52:
                r5.saveFileBlocking(r2)     // Catch: java.lang.Throwable -> L5e
            L55:
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5e
                r2.setLastModified(r3)     // Catch: java.lang.Throwable -> L5e
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                return
            L5e:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
                throw r0
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.String[] r1) {
                r0 = this;
                java.lang.String[] r1 = (java.lang.String[]) r1
                java.lang.Void r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected java.lang.Void doInBackground2(java.lang.String... r1) {
                r0 = this;
                r0.saveFileIfNeededBlocking()
                r1 = 0
                return r1
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.onPostExecute2(r1)
                return
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(java.lang.Void r3) {
                r2 = this;
                androidx.browser.browseractions.BrowserServiceFileProvider$FileCleanupTask r3 = new androidx.browser.browseractions.BrowserServiceFileProvider$FileCleanupTask
                android.content.Context r0 = r2.mAppContext
                r3.<init>(r0)
                java.util.concurrent.Executor r0 = android.os.AsyncTask.SERIAL_EXECUTOR
                r1 = 0
                java.lang.Void[] r1 = new java.lang.Void[r1]
                r3.executeOnExecutor(r0, r1)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock = r0
            return
    }

    public BrowserServiceFileProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.net.Uri generateUri(android.content.Context r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "image_provider_images/"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ".png"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPackageName()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = ".image_provider"
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.net.Uri$Builder r2 = r0.authority(r2)
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
            return r2
    }

    public static void grantReadPermission(android.content.Intent r3, java.util.List<android.net.Uri> r4, android.content.Context r5) {
            if (r4 == 0) goto L38
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L38
        L9:
            android.content.ContentResolver r5 = r5.getContentResolver()
            r0 = 1
            r3.addFlags(r0)
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r2 = "image_provider_uris"
            android.content.ClipData r5 = android.content.ClipData.newUri(r5, r2, r1)
        L1e:
            int r1 = r4.size()
            if (r0 >= r1) goto L35
            android.content.ClipData$Item r1 = new android.content.ClipData$Item
            java.lang.Object r2 = r4.get(r0)
            android.net.Uri r2 = (android.net.Uri) r2
            r1.<init>(r2)
            r5.addItem(r1)
            int r0 = r0 + 1
            goto L1e
        L35:
            r3.setClipData(r5)
        L38:
            return
    }

    public static com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(android.content.ContentResolver r3, android.net.Uri r4) {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            androidx.browser.browseractions.BrowserServiceFileProvider$1 r2 = new androidx.browser.browseractions.BrowserServiceFileProvider$1
            r2.<init>(r3, r4, r0)
            r1.execute(r2)
            return r0
    }

    public static androidx.concurrent.futures.ResolvableFuture<android.net.Uri> saveBitmap(android.content.Context r6, android.graphics.Bitmap r7, java.lang.String r8, int r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = "_"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r9 = java.lang.Integer.toString(r9)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r2 = r8.toString()
            android.net.Uri r4 = generateUri(r6, r2)
            androidx.concurrent.futures.ResolvableFuture r8 = androidx.concurrent.futures.ResolvableFuture.create()
            androidx.browser.browseractions.BrowserServiceFileProvider$FileSaveTask r9 = new androidx.browser.browseractions.BrowserServiceFileProvider$FileSaveTask
            r0 = r9
            r1 = r6
            r3 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.Executor r6 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r7 = 0
            java.lang.String[] r7 = new java.lang.String[r7]
            r9.executeOnExecutor(r6, r7)
            return r8
    }
}
