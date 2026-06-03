package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCompat {

    static class Api19Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock = r0
                return
        }

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock     // Catch: java.lang.Exception -> L3f
                monitor-enter(r1)     // Catch: java.lang.Exception -> L3f
                boolean r2 = androidx.core.os.ProcessCompat.Api19Impl.sResolved     // Catch: java.lang.Throwable -> L3c
                if (r2 != 0) goto L1b
                androidx.core.os.ProcessCompat.Api19Impl.sResolved = r0     // Catch: java.lang.Throwable -> L3c
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r3 = "isApp"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3c
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.Throwable -> L3c
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L3c
                androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L3c
            L1b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L3f
                if (r1 == 0) goto L43
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L3f
                java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L3f
                r2 = 0
                java.lang.Object r7 = r1.invoke(r2, r7)     // Catch: java.lang.Exception -> L3f
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L3f
                if (r7 == 0) goto L36
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L3f
                return r7
            L36:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L3f
                r7.<init>()     // Catch: java.lang.Exception -> L3f
                throw r7     // Catch: java.lang.Exception -> L3f
            L3c:
                r7 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
                throw r7     // Catch: java.lang.Exception -> L3f
            L3f:
                r7 = move-exception
                r7.printStackTrace()
            L43:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r0) {
                boolean r0 = android.os.Process.isApplicationUid(r0)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r0) {
            boolean r0 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r0)
            return r0
    }
}
