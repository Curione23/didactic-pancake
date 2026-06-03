package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public final class Logger {
    private static final net.kdt.pojavlaunch.Logger.eventLogListener DISPATCHER = null;
    private static final java.util.concurrent.CopyOnWriteArrayList<net.kdt.pojavlaunch.Logger.eventLogListener> LOG_LISTENERS = null;
    private static final java.lang.String TAG = "PojavLogger";
    private static volatile java.io.File currentLogFile;

    public interface eventLogListener {
        void onEventLogged(java.lang.String r1);
    }

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            net.kdt.pojavlaunch.Logger.LOG_LISTENERS = r0
            net.kdt.pojavlaunch.Logger$$ExternalSyntheticLambda0 r0 = new net.kdt.pojavlaunch.Logger$$ExternalSyntheticLambda0
            r0.<init>()
            net.kdt.pojavlaunch.Logger.DISPATCHER = r0
            java.lang.String r0 = "pojavexec"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    private Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addLogListener(net.kdt.pojavlaunch.Logger.eventLogListener r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.concurrent.CopyOnWriteArrayList<net.kdt.pojavlaunch.Logger$eventLogListener> r0 = net.kdt.pojavlaunch.Logger.LOG_LISTENERS
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto Le
            r0.add(r2)
        Le:
            installDispatcherIfNeeded()
            return
    }

    public static native void appendToLog(java.lang.String r0);

    public static native void begin(java.lang.String r0);

    public static void beginLog(java.io.File r4) {
            java.lang.String r0 = "PojavLogger"
            java.lang.String r1 = "Native log redirection started at "
            java.io.File r2 = r4.getParentFile()
            if (r2 == 0) goto L13
            boolean r3 = r2.exists()
            if (r3 != 0) goto L13
            r2.mkdirs()
        L13:
            net.kdt.pojavlaunch.Logger.currentLogFile = r4
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L31
            begin(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L31
            android.util.Log.i(r0, r4)     // Catch: java.lang.Throwable -> L31
            goto L3a
        L31:
            r4 = move-exception
            java.lang.String r1 = "Native log redirection failed"
            android.util.Log.e(r0, r1, r4)
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
        L3a:
            return
    }

    public static void clearLogListeners() {
            java.util.concurrent.CopyOnWriteArrayList<net.kdt.pojavlaunch.Logger$eventLogListener> r0 = net.kdt.pojavlaunch.Logger.LOG_LISTENERS
            r0.clear()
            r0 = 0
            setLogListener(r0)     // Catch: java.lang.Throwable -> La
            goto L12
        La:
            r0 = move-exception
            java.lang.String r1 = "PojavLogger"
            java.lang.String r2 = "Unable to clear native log listeners"
            android.util.Log.w(r1, r2, r0)
        L12:
            return
    }

    public static java.io.File getCurrentLogFile() {
            java.io.File r0 = net.kdt.pojavlaunch.Logger.currentLogFile
            return r0
    }

    private static void installDispatcherIfNeeded() {
            net.kdt.pojavlaunch.Logger$eventLogListener r0 = net.kdt.pojavlaunch.Logger.DISPATCHER     // Catch: java.lang.Throwable -> L6
            setLogListener(r0)     // Catch: java.lang.Throwable -> L6
            goto Le
        L6:
            r0 = move-exception
            java.lang.String r1 = "PojavLogger"
            java.lang.String r2 = "Unable to install native log dispatcher"
            android.util.Log.w(r1, r2, r0)
        Le:
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.String r4) {
            java.lang.String r4 = ca.dnamobile.javalauncher.logs.LatestLogTextFilter.cleanRealtimeLine(r4)
            if (r4 != 0) goto L7
            return
        L7:
            java.util.concurrent.CopyOnWriteArrayList<net.kdt.pojavlaunch.Logger$eventLogListener> r0 = net.kdt.pojavlaunch.Logger.LOG_LISTENERS
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            net.kdt.pojavlaunch.Logger$eventLogListener r1 = (net.kdt.pojavlaunch.Logger.eventLogListener) r1
            r1.onEventLogged(r4)     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r1 = move-exception
            java.lang.String r2 = "PojavLogger"
            java.lang.String r3 = "Log listener failed"
            android.util.Log.w(r2, r3, r1)
            goto Ld
        L26:
            return
    }

    public static void removeLogListener(net.kdt.pojavlaunch.Logger.eventLogListener r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.concurrent.CopyOnWriteArrayList<net.kdt.pojavlaunch.Logger$eventLogListener> r0 = net.kdt.pojavlaunch.Logger.LOG_LISTENERS
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1b
            r2 = 0
            setLogListener(r2)     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r2 = move-exception
            java.lang.String r0 = "PojavLogger"
            java.lang.String r1 = "Unable to clear native log listener"
            android.util.Log.w(r0, r1, r2)
        L1b:
            return
    }

    public static native void setLogListener(net.kdt.pojavlaunch.Logger.eventLogListener r0);
}
