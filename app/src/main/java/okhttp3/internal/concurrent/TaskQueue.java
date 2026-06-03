package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", "", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", "", "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", "", "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", "", "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", "", "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", "", "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskQueue {
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;
    private final java.lang.String name;
    private boolean shutdown;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {
        private final java.util.concurrent.CountDownLatch latch;

        public AwaitIdleTask() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = okhttp3.internal.Util.okHttpName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " awaitIdle"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.latch = r0
                return
        }

        public final java.util.concurrent.CountDownLatch getLatch() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.latch
                return r0
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = r2.latch
                r0.countDown()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $block;

        public AnonymousClass1(java.lang.String r1, boolean r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
                r0 = this;
                r0.$block = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.$block
                r0.invoke()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass2 extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Long> $block;

        public AnonymousClass2(java.lang.String r3, kotlin.jvm.functions.Function0<java.lang.Long> r4) {
                r2 = this;
                r2.$block = r4
                r4 = 2
                r0 = 0
                r1 = 0
                r2.<init>(r3, r1, r4, r0)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r2 = this;
                kotlin.jvm.functions.Function0<java.lang.Long> r0 = r2.$block
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }
    }

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.taskRunner = r2
            r1.name = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r1.futureTasks = r2
            return
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, boolean r4, kotlin.jvm.functions.Function0 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L6
            r2 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r4 = 1
        Lb:
            java.lang.String r6 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            okhttp3.internal.concurrent.TaskQueue$execute$1 r6 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r6.<init>(r1, r4, r5)
            okhttp3.internal.concurrent.Task r6 = (okhttp3.internal.concurrent.Task) r6
            r0.schedule(r6, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, java.lang.String r1, long r2, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r5 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r5 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r5.<init>(r1, r4)
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5
            r0.schedule(r5, r2)
            return
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue r0, okhttp3.internal.concurrent.Task r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            r0.schedule(r1, r2)
            return
    }

    public final void cancelAll() {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            okhttp3.internal.concurrent.TaskRunner r0 = r3.taskRunner
            monitor-enter(r0)
            boolean r1 = r3.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L40
            okhttp3.internal.concurrent.TaskRunner r1 = r3.taskRunner     // Catch: java.lang.Throwable -> L44
            r1.kickCoordinator$okhttp(r3)     // Catch: java.lang.Throwable -> L44
        L40:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return
        L44:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean cancelAllAndDecide$okhttp() {
            r5 = this;
            okhttp3.internal.concurrent.Task r0 = r5.activeTask
            r1 = 1
            if (r0 == 0) goto L10
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.getCancelable()
            if (r0 == 0) goto L10
            r5.cancelActiveTask = r1
        L10:
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r5.futureTasks
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = 0
        L18:
            r3 = -1
            if (r3 >= r0) goto L4d
            java.util.List<okhttp3.internal.concurrent.Task> r3 = r5.futureTasks
            java.lang.Object r3 = r3.get(r0)
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            boolean r3 = r3.getCancelable()
            if (r3 == 0) goto L4a
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            java.lang.Object r2 = r2.get(r0)
            okhttp3.internal.concurrent.Task r2 = (okhttp3.internal.concurrent.Task) r2
            okhttp3.internal.concurrent.TaskRunner$Companion r3 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r3 = r3.getLogger()
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L44
            java.lang.String r3 = "canceled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r2, r5, r3)
        L44:
            java.util.List<okhttp3.internal.concurrent.Task> r2 = r5.futureTasks
            r2.remove(r0)
            r2 = r1
        L4a:
            int r0 = r0 + (-1)
            goto L18
        L4d:
            return r2
    }

    public final void execute(java.lang.String r2, long r3, boolean r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.internal.concurrent.TaskQueue$execute$1 r0 = new okhttp3.internal.concurrent.TaskQueue$execute$1
            r0.<init>(r2, r5, r6)
            okhttp3.internal.concurrent.Task r0 = (okhttp3.internal.concurrent.Task) r0
            r1.schedule(r0, r3)
            return
    }

    public final okhttp3.internal.concurrent.Task getActiveTask$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.Task r0 = r1.activeTask
            return r0
    }

    public final boolean getCancelActiveTask$okhttp() {
            r1 = this;
            boolean r0 = r1.cancelActiveTask
            return r0
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
            r1 = this;
            java.util.List<okhttp3.internal.concurrent.Task> r0 = r1.futureTasks
            return r0
    }

    public final java.lang.String getName$okhttp() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
            r2 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r2.futureTasks     // Catch: java.lang.Throwable -> Ld
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> Ld
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean getShutdown$okhttp() {
            r1 = this;
            boolean r0 = r1.shutdown
            return r0
    }

    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner$okhttp() {
            r1 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r1.taskRunner
            return r0
    }

    public final java.util.concurrent.CountDownLatch idleLatch() {
            r6 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r6.taskRunner
            monitor-enter(r0)
            okhttp3.internal.concurrent.Task r1 = r6.activeTask     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 != 0) goto L17
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r6.futureTasks     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L17
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return r1
        L17:
            okhttp3.internal.concurrent.Task r1 = r6.activeTask     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r1 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L25
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r1     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return r1
        L25:
            java.util.List<okhttp3.internal.concurrent.Task> r1 = r6.futureTasks     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        L2b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5e
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3     // Catch: java.lang.Throwable -> L5e
            boolean r4 = r3 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L2b
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r3 = (okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) r3     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.CountDownLatch r1 = r3.getLatch()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return r1
        L43:
            okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask r1 = new okhttp3.internal.concurrent.TaskQueue$AwaitIdleTask     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            r3 = r1
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3     // Catch: java.lang.Throwable -> L5e
            r4 = 0
            boolean r2 = r6.scheduleAndDecide$okhttp(r3, r4, r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L58
            okhttp3.internal.concurrent.TaskRunner r2 = r6.taskRunner     // Catch: java.lang.Throwable -> L5e
            r2.kickCoordinator$okhttp(r6)     // Catch: java.lang.Throwable -> L5e
        L58:
            java.util.concurrent.CountDownLatch r1 = r1.getLatch()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return r1
        L5e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void schedule(java.lang.String r2, long r3, kotlin.jvm.functions.Function0<java.lang.Long> r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.internal.concurrent.TaskQueue$schedule$2 r0 = new okhttp3.internal.concurrent.TaskQueue$schedule$2
            r0.<init>(r2, r5)
            okhttp3.internal.concurrent.Task r0 = (okhttp3.internal.concurrent.Task) r0
            r1.schedule(r0, r3)
            return
    }

    public final void schedule(okhttp3.internal.concurrent.Task r3, long r4) {
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.concurrent.TaskRunner r0 = r2.taskRunner
            monitor-enter(r0)
            boolean r1 = r2.shutdown     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L40
            boolean r4 = r3.getCancelable()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L27
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L50
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L50
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L25
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L50
        L25:
            monitor-exit(r0)
            return
        L27:
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion     // Catch: java.lang.Throwable -> L50
            java.util.logging.Logger r4 = r4.getLogger()     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L50
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L3a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r3, r2, r4)     // Catch: java.lang.Throwable -> L50
        L3a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L50
        L40:
            r1 = 0
            boolean r3 = r2.scheduleAndDecide$okhttp(r3, r4, r1)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4c
            okhttp3.internal.concurrent.TaskRunner r3 = r2.taskRunner     // Catch: java.lang.Throwable -> L50
            r3.kickCoordinator$okhttp(r2)     // Catch: java.lang.Throwable -> L50
        L4c:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return
        L50:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final boolean scheduleAndDecide$okhttp(okhttp3.internal.concurrent.Task r10, long r11, boolean r13) {
            r9 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10.initQueue$okhttp(r9)
            okhttp3.internal.concurrent.TaskRunner r0 = r9.taskRunner
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r0 = r0.nanoTime()
            long r2 = r0 + r11
            java.util.List<okhttp3.internal.concurrent.Task> r4 = r9.futureTasks
            int r4 = r4.indexOf(r10)
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L3f
            long r7 = r10.getNextExecuteNanoTime$okhttp()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L3a
            okhttp3.internal.concurrent.TaskRunner$Companion r11 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r11 = r11.getLogger()
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            boolean r11 = r11.isLoggable(r12)
            if (r11 == 0) goto L39
            java.lang.String r11 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r10, r9, r11)
        L39:
            return r5
        L3a:
            java.util.List<okhttp3.internal.concurrent.Task> r7 = r9.futureTasks
            r7.remove(r4)
        L3f:
            r10.setNextExecuteNanoTime$okhttp(r2)
            okhttp3.internal.concurrent.TaskRunner$Companion r4 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r4 = r4.getLogger()
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r7)
            if (r4 == 0) goto L7e
            if (r13 == 0) goto L67
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "run again after "
            r13.<init>(r4)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            java.lang.StringBuilder r13 = r13.append(r2)
            java.lang.String r13 = r13.toString()
            goto L7b
        L67:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "scheduled after "
            r13.<init>(r4)
            long r2 = r2 - r0
            java.lang.String r2 = okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(r2)
            java.lang.StringBuilder r13 = r13.append(r2)
            java.lang.String r13 = r13.toString()
        L7b:
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(r10, r9, r13)
        L7e:
            java.util.List<okhttp3.internal.concurrent.Task> r13 = r9.futureTasks
            java.util.Iterator r13 = r13.iterator()
            r2 = r5
        L85:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r13.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r3 = r3.getNextExecuteNanoTime$okhttp()
            long r3 = r3 - r0
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L9b
            goto L9f
        L9b:
            int r2 = r2 + 1
            goto L85
        L9e:
            r2 = r6
        L9f:
            if (r2 != r6) goto La7
            java.util.List<okhttp3.internal.concurrent.Task> r11 = r9.futureTasks
            int r2 = r11.size()
        La7:
            java.util.List<okhttp3.internal.concurrent.Task> r11 = r9.futureTasks
            r11.add(r2, r10)
            if (r2 != 0) goto Laf
            r5 = 1
        Laf:
            return r5
    }

    public final void setActiveTask$okhttp(okhttp3.internal.concurrent.Task r1) {
            r0 = this;
            r0.activeTask = r1
            return
    }

    public final void setCancelActiveTask$okhttp(boolean r1) {
            r0 = this;
            r0.cancelActiveTask = r1
            return
    }

    public final void setShutdown$okhttp(boolean r1) {
            r0 = this;
            r0.shutdown = r1
            return
    }

    public final void shutdown() {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            okhttp3.internal.concurrent.TaskRunner r0 = r3.taskRunner
            monitor-enter(r0)
            r1 = 1
            r3.shutdown = r1     // Catch: java.lang.Throwable -> L47
            boolean r1 = r3.cancelAllAndDecide$okhttp()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L43
            okhttp3.internal.concurrent.TaskRunner r1 = r3.taskRunner     // Catch: java.lang.Throwable -> L47
            r1.kickCoordinator$okhttp(r3)     // Catch: java.lang.Throwable -> L47
        L43:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)
            return
        L47:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
