package androidx.activity;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0016\u001a\u00020\u0006J\b\u0010\u0017\u001a\u00020\u0006H\u0007J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u001a\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "executor", "Ljava/util/concurrent/Executor;", "reportFullyDrawn", "Lkotlin/Function0;", "", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "isFullyDrawnReported", "", "()Z", "lock", "onReportCallbacks", "", "reportPosted", "reportRunnable", "Ljava/lang/Runnable;", "reportedFullyDrawn", "reporterCount", "", "addOnReportDrawnListener", "callback", "addReporter", "fullyDrawnReported", "postWhenReportersAreDone", "removeOnReportDrawnListener", "removeReporter", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporter {
    private final java.util.concurrent.Executor executor;
    private final java.lang.Object lock;
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> onReportCallbacks;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> reportFullyDrawn;
    private boolean reportPosted;
    private final java.lang.Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    /* JADX INFO: renamed from: $r8$lambda$A0RwxxT-QIMFOsDA3Nv48auR1K4, reason: not valid java name */
    public static /* synthetic */ void m8$r8$lambda$A0RwxxTQIMFOsDA3Nv48auR1K4(androidx.activity.FullyDrawnReporter r0) {
            reportRunnable$lambda$2(r0)
            return
    }

    public FullyDrawnReporter(java.util.concurrent.Executor r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r1 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "reportFullyDrawn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.executor = r2
            r1.reportFullyDrawn = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lock = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r1.onReportCallbacks = r2
            androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0 r2 = new androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            r2.<init>(r1)
            r1.reportRunnable = r2
            return
    }

    private final void postWhenReportersAreDone() {
            r2 = this;
            boolean r0 = r2.reportPosted
            if (r0 != 0) goto L12
            int r0 = r2.reporterCount
            if (r0 != 0) goto L12
            r0 = 1
            r2.reportPosted = r0
            java.util.concurrent.Executor r0 = r2.executor
            java.lang.Runnable r1 = r2.reportRunnable
            r0.execute(r1)
        L12:
            return
    }

    private static final void reportRunnable$lambda$2(androidx.activity.FullyDrawnReporter r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r1 = 0
            r2.reportPosted = r1     // Catch: java.lang.Throwable -> L1f
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1b
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1b
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r2.reportFullyDrawn     // Catch: java.lang.Throwable -> L1f
            r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r2.fullyDrawnReported()     // Catch: java.lang.Throwable -> L1f
        L1b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L1f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void addOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Le
            r1 = 1
            goto L16
        Le:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r2.onReportCallbacks     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L1d
            r1.add(r3)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        L16:
            monitor-exit(r0)
            if (r1 == 0) goto L1c
            r3.invoke()
        L1c:
            return
        L1d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void addReporter() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Ld
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r2.reporterCount = r1     // Catch: java.lang.Throwable -> L11
        Ld:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void fullyDrawnReported() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 1
            r3.reportedFullyDrawn = r1     // Catch: java.lang.Throwable -> L27
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L27
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2     // Catch: java.lang.Throwable -> L27
            r2.invoke()     // Catch: java.lang.Throwable -> L27
            goto Le
        L1e:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L27
            r1.clear()     // Catch: java.lang.Throwable -> L27
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean isFullyDrawnReported() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void removeOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r2.onReportCallbacks     // Catch: java.lang.Throwable -> L13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L13
            r1.remove(r3)     // Catch: java.lang.Throwable -> L13
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void removeReporter() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> L16
            if (r1 <= 0) goto L12
            int r1 = r1 + (-1)
            r2.reporterCount = r1     // Catch: java.lang.Throwable -> L16
            r2.postWhenReportersAreDone()     // Catch: java.lang.Throwable -> L16
        L12:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
