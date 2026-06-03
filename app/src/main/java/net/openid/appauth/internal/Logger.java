package net.openid.appauth.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger {
    static final java.lang.String LOG_TAG = "AppAuth";
    private static net.openid.appauth.internal.Logger sInstance;
    private final net.openid.appauth.internal.Logger.LogWrapper mLog;
    private final int mLogLevel;

    private static final class AndroidLogWrapper implements net.openid.appauth.internal.Logger.LogWrapper {
        private static final net.openid.appauth.internal.Logger.AndroidLogWrapper INSTANCE = null;

        static {
                net.openid.appauth.internal.Logger$AndroidLogWrapper r0 = new net.openid.appauth.internal.Logger$AndroidLogWrapper
                r0.<init>()
                net.openid.appauth.internal.Logger.AndroidLogWrapper.INSTANCE = r0
                return
        }

        private AndroidLogWrapper() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ net.openid.appauth.internal.Logger.AndroidLogWrapper access$000() {
                net.openid.appauth.internal.Logger$AndroidLogWrapper r0 = net.openid.appauth.internal.Logger.AndroidLogWrapper.INSTANCE
                return r0
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public java.lang.String getStackTraceString(java.lang.Throwable r1) {
                r0 = this;
                java.lang.String r1 = android.util.Log.getStackTraceString(r1)
                return r1
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public boolean isLoggable(java.lang.String r1, int r2) {
                r0 = this;
                boolean r1 = android.util.Log.isLoggable(r1, r2)
                return r1
        }

        @Override // net.openid.appauth.internal.Logger.LogWrapper
        public void println(int r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                android.util.Log.println(r1, r2, r3)
                return
        }
    }

    public interface LogWrapper {
        java.lang.String getStackTraceString(java.lang.Throwable r1);

        boolean isLoggable(java.lang.String r1, int r2);

        void println(int r1, java.lang.String r2, java.lang.String r3);
    }

    Logger(net.openid.appauth.internal.Logger.LogWrapper r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = net.openid.appauth.Preconditions.checkNotNull(r3)
            net.openid.appauth.internal.Logger$LogWrapper r3 = (net.openid.appauth.internal.Logger.LogWrapper) r3
            r2.mLog = r3
            r3 = 7
        Lc:
            r0 = 2
            if (r3 < r0) goto L1c
            net.openid.appauth.internal.Logger$LogWrapper r0 = r2.mLog
            java.lang.String r1 = "AppAuth"
            boolean r0 = r0.isLoggable(r1, r3)
            if (r0 == 0) goto L1c
            int r3 = r3 + (-1)
            goto Lc
        L1c:
            int r3 = r3 + 1
            r2.mLogLevel = r3
            return
    }

    public static void debug(java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 3
            r2 = 0
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void debugWithStack(java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 3
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void error(java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 6
            r2 = 0
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void errorWithStack(java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 6
            r0.log(r1, r2, r3, r4)
            return
    }

    public static synchronized net.openid.appauth.internal.Logger getInstance() {
            java.lang.Class<net.openid.appauth.internal.Logger> r0 = net.openid.appauth.internal.Logger.class
            monitor-enter(r0)
            net.openid.appauth.internal.Logger r1 = net.openid.appauth.internal.Logger.sInstance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            net.openid.appauth.internal.Logger r1 = new net.openid.appauth.internal.Logger     // Catch: java.lang.Throwable -> L16
            net.openid.appauth.internal.Logger$AndroidLogWrapper r2 = net.openid.appauth.internal.Logger.AndroidLogWrapper.access$000()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            net.openid.appauth.internal.Logger.sInstance = r1     // Catch: java.lang.Throwable -> L16
        L12:
            net.openid.appauth.internal.Logger r1 = net.openid.appauth.internal.Logger.sInstance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public static void info(java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 4
            r2 = 0
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void infoWithStack(java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 4
            r0.log(r1, r2, r3, r4)
            return
    }

    public static synchronized void setInstance(net.openid.appauth.internal.Logger r1) {
            java.lang.Class<net.openid.appauth.internal.Logger> r0 = net.openid.appauth.internal.Logger.class
            monitor-enter(r0)
            net.openid.appauth.internal.Logger.sInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void verbose(java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 2
            r2 = 0
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void verboseWithStack(java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 2
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void warn(java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 5
            r2 = 0
            r0.log(r1, r2, r3, r4)
            return
    }

    public static void warnWithStack(java.lang.Throwable r2, java.lang.String r3, java.lang.Object... r4) {
            net.openid.appauth.internal.Logger r0 = getInstance()
            r1 = 5
            r0.log(r1, r2, r3, r4)
            return
    }

    public void log(int r3, java.lang.Throwable r4, java.lang.String r5, java.lang.Object... r6) {
            r2 = this;
            int r0 = r2.mLogLevel
            if (r0 <= r3) goto L5
            return
        L5:
            if (r6 == 0) goto L10
            int r0 = r6.length
            r1 = 1
            if (r0 >= r1) goto Lc
            goto L10
        Lc:
            java.lang.String r5 = java.lang.String.format(r5, r6)
        L10:
            if (r4 == 0) goto L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = "\n"
            java.lang.StringBuilder r5 = r5.append(r6)
            net.openid.appauth.internal.Logger$LogWrapper r6 = r2.mLog
            java.lang.String r4 = r6.getStackTraceString(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = r4.toString()
        L2f:
            net.openid.appauth.internal.Logger$LogWrapper r4 = r2.mLog
            java.lang.String r6 = "AppAuth"
            r4.println(r3, r6, r5)
            return
    }
}
