package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class AdrenoSyncFenceFdGuard {
    private static final int CRITICAL_SYNC_FDS = 4096;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> FIRST_SEEN_MS = null;
    private static final long SCAN_INTERVAL_MS = 2000;
    private static final java.util.concurrent.atomic.AtomicBoolean STARTED = null;
    private static final java.lang.String TAG = "AdrenoSyncFenceFdGuard";
    private static final int WARN_SYNC_FDS = 1536;


    private static final class Snapshot {
        int openFdCount;
        final java.util.ArrayList<java.lang.String> samples;
        final java.util.ArrayList<java.lang.Integer> syncFileFds;

        private Snapshot() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.syncFileFds = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.samples = r0
                return
        }

        /* synthetic */ Snapshot(ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.SnapshotIA r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$Snapshot-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class SnapshotIA {
    }

    /* JADX INFO: renamed from: -$$Nest$smrunGuardLoop, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m556$$Nest$smrunGuardLoop() {
            runGuardLoop()
            return
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.STARTED = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.FIRST_SEEN_MS = r0
            return
    }

    private AdrenoSyncFenceFdGuard() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isSyncFile(java.lang.String r1) {
            if (r1 == 0) goto L12
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "anon_inode:sync_file"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private static int parseFd(java.lang.String r1) {
            r0 = -1
            if (r1 != 0) goto L4
            return r0
        L4:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r0
    }

    private static java.lang.String readFdTarget(java.lang.String r3) {
            java.lang.String r0 = "/proc/self/fd"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L15
            java.nio.file.Path r3 = java.nio.file.Paths.get(r0, r1)     // Catch: java.lang.Throwable -> L15
            java.nio.file.Path r3 = java.nio.file.Files.readSymbolicLink(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            java.lang.String r3 = ""
            return r3
    }

    private static void runGuardLoop() {
            java.lang.String r0 = "AdrenoSyncFenceFdGuard"
            r1 = 0
            r2 = r1
        L4:
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r2 = r2 + 1
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$Snapshot r3 = scan()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.util.ArrayList<java.lang.Integer> r4 = r3.syncFileFds     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r4 = r4.size()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            r5 = 1536(0x600, float:2.152E-42)
            r6 = 1
            if (r4 < r5) goto L1c
            r4 = r6
            goto L1d
        L1c:
            r4 = r1
        L1d:
            java.util.ArrayList<java.lang.Integer> r5 = r3.syncFileFds     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r5 = r5.size()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            r7 = 4096(0x1000, float:5.74E-42)
            if (r5 < r7) goto L29
            r5 = r6
            goto L2a
        L29:
            r5 = r1
        L2a:
            java.lang.String r7 = " syncFiles="
            if (r2 == r6) goto L34
            int r6 = r2 % 5
            if (r6 == 0) goto L34
            if (r4 == 0) goto L7a
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            r4.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r6 = "Sync fence FD monitor snapshot openFds="
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r6 = r3.openFdCount     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.util.ArrayList<java.lang.Integer> r6 = r3.syncFileFds     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r6 = " state="
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.util.ArrayList<java.lang.Integer> r6 = r3.syncFileFds     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r6 = stateName(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r6 = " action=log-only samples="
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.util.ArrayList<java.lang.String> r6 = r3.samples     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
        L7a:
            if (r5 == 0) goto L4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            r4.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r5 = "Critical MobileGlues/Adreno sync_file FD pressure detected; not closing foreign FDs. Try MobileGlues multidrawMode=Force DrawElements or disable experimental compute/indirect draw paths. openFds="
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r5 = r3.openFdCount     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.util.ArrayList<java.lang.Integer> r3 = r3.syncFileFds     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r3)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Lac
            goto L4
        La4:
            r3 = move-exception
            java.lang.String r4 = "Adreno sync_file FD monitor failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r3)
            goto L4
        Lac:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    private static ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.Snapshot scan() {
            long r0 = java.lang.System.currentTimeMillis()
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$Snapshot r2 = new ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$Snapshot
            r3 = 0
            r2.<init>(r3)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/proc/self/fd"
            r3.<init>(r4)
            java.lang.String[] r3 = r3.list()
            if (r3 == 0) goto L19
            int r4 = r3.length
            goto L1a
        L19:
            r4 = -1
        L1a:
            r2.openFdCount = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r3 == 0) goto La0
            int r5 = r3.length
            r6 = 0
        L25:
            if (r6 >= r5) goto La0
            r7 = r3[r6]
            int r8 = parseFd(r7)
            if (r8 >= 0) goto L30
            goto L9d
        L30:
            java.lang.String r7 = readFdTarget(r7)
            boolean r9 = isSyncFile(r7)
            if (r9 != 0) goto L3b
            goto L9d
        L3b:
            java.util.ArrayList<java.lang.Integer> r9 = r2.syncFileFds
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r9.add(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r4.add(r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r9 = ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.FIRST_SEEN_MS
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.Object r9 = r9.putIfAbsent(r10, r11)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L61
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L61:
            java.util.ArrayList<java.lang.String> r10 = r2.samples
            int r10 = r10.size()
            r11 = 10
            if (r10 >= r11) goto L9d
            java.util.ArrayList<java.lang.String> r10 = r2.samples
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r8 = r11.append(r8)
            java.lang.String r11 = ":"
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = ":ageMs="
            java.lang.StringBuilder r7 = r7.append(r8)
            long r8 = r9.longValue()
            long r8 = r0 - r8
            r11 = 0
            long r8 = java.lang.Math.max(r11, r8)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r10.add(r7)
        L9d:
            int r6 = r6 + 1
            goto L25
        La0:
            java.util.ArrayList<java.lang.Integer> r0 = r2.syncFileFds
            java.util.Collections.sort(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r0 = ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.FIRST_SEEN_MS
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Laf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto Laf
            r0.remove()
            goto Laf
        Lc5:
            return r2
    }

    public static void startIfNeeded(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            boolean r0 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.isMobileGluesRenderer(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicBoolean r0 = ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.STARTED
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L12
            return
        L12:
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$1 r1 = new ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard$1
            r1.<init>()
            java.lang.String r3 = "DroidBridge-AdrenoSyncFenceGuard"
            r0.<init>(r1, r3)
            r0.setDaemon(r2)
            r0.start()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Started Adreno sync_file FD monitor device="
            r0.<init>(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = safe(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r1 = safe(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " renderer="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.getRendererName()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " mode=log-only warn=1536 critical=4096"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "AdrenoSyncFenceFdGuard"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
            return
    }

    private static java.lang.String stateName(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 < r0) goto L7
            java.lang.String r1 = "critical"
            return r1
        L7:
            r0 = 1536(0x600, float:2.152E-42)
            if (r1 < r0) goto Le
            java.lang.String r1 = "warning"
            return r1
        Le:
            java.lang.String r1 = "normal"
            return r1
    }
}
