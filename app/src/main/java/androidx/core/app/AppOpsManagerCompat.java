package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T getSystemService(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        static int noteProxyOp(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOp(r1, r2)
                return r0
        }

        static int noteProxyOpNoThrow(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOpNoThrow(r1, r2)
                return r0
        }

        static java.lang.String permissionToOp(java.lang.String r0) {
                java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r0)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int checkOpNoThrow(android.app.AppOpsManager r0, java.lang.String r1, int r2, java.lang.String r3) {
                if (r0 != 0) goto L4
                r0 = 1
                return r0
            L4:
                int r0 = r0.checkOpNoThrow(r1, r2, r3)
                return r0
        }

        static java.lang.String getOpPackageName(android.content.Context r0) {
                java.lang.String r0 = r0.getOpPackageName()
                return r0
        }

        static android.app.AppOpsManager getSystemService(android.content.Context r1) {
                java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
                return r1
        }
    }

    private AppOpsManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkOrNoteProxyOp(android.content.Context r2, int r3, java.lang.String r4, java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            android.app.AppOpsManager r0 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getSystemService(r2)
            int r1 = android.os.Binder.getCallingUid()
            int r5 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r4, r1, r5)
            if (r5 == 0) goto L15
            return r5
        L15:
            java.lang.String r2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getOpPackageName(r2)
            int r2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r4, r3, r2)
            return r2
        L1e:
            int r2 = noteProxyOpNoThrow(r2, r4, r5)
            return r2
    }

    public static int noteOp(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOp(r2, r3, r4)
            return r1
    }

    public static int noteOpNoThrow(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOpNoThrow(r2, r3, r4)
            return r1
    }

    public static int noteProxyOp(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r1, r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOp(r1, r2, r3)
            return r1
    }

    public static int noteProxyOpNoThrow(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r1, r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOpNoThrow(r1, r2, r3)
            return r1
    }

    public static java.lang.String permissionToOp(java.lang.String r0) {
            java.lang.String r0 = androidx.core.app.AppOpsManagerCompat.Api23Impl.permissionToOp(r0)
            return r0
    }
}
