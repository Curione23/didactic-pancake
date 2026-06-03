package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class BenchmarkOperation {

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getCodeCacheDir(android.content.Context r0) {
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File getDeviceProtectedCodeCacheDir(android.content.Context r0) {
                android.content.Context r0 = r0.createDeviceProtectedStorageContext()
                java.io.File r0 = r0.getCodeCacheDir()
                return r0
        }
    }

    private BenchmarkOperation() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean deleteFilesRecursively(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = deleteFilesRecursively(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    static void dropShaderCache(android.content.Context r1, androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics r2) {
            java.io.File r1 = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.getDeviceProtectedCodeCacheDir(r1)
            boolean r1 = deleteFilesRecursively(r1)
            r0 = 0
            if (r1 == 0) goto L11
            r1 = 14
            r2.onResultReceived(r1, r0)
            goto L16
        L11:
            r1 = 15
            r2.onResultReceived(r1, r0)
        L16:
            return
    }
}
