package org.apache.commons.io.monitor;

/* JADX INFO: loaded from: classes2.dex */
public final class FileAlterationMonitor implements java.lang.Runnable {
    private static final org.apache.commons.io.monitor.FileAlterationObserver[] EMPTY_ARRAY = null;
    private final long intervalMillis;
    private final java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> observers;
    private volatile boolean running;
    private java.lang.Thread thread;
    private java.util.concurrent.ThreadFactory threadFactory;

    /* JADX INFO: renamed from: $r8$lambda$gzGXVxF49C1sEWfrB5-CYlmFFY8, reason: not valid java name */
    public static /* synthetic */ boolean m2637$r8$lambda$gzGXVxF49C1sEWfrB5CYlmFFY8(org.apache.commons.io.monitor.FileAlterationObserver r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    static {
            r0 = 0
            org.apache.commons.io.monitor.FileAlterationObserver[] r0 = new org.apache.commons.io.monitor.FileAlterationObserver[r0]
            org.apache.commons.io.monitor.FileAlterationMonitor.EMPTY_ARRAY = r0
            return
    }

    public FileAlterationMonitor() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r0)
            return
    }

    public FileAlterationMonitor(long r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.observers = r0
            r1.intervalMillis = r2
            return
    }

    public FileAlterationMonitor(long r2, java.util.Collection<org.apache.commons.io.monitor.FileAlterationObserver> r4) {
            r1 = this;
            java.util.Optional r4 = java.util.Optional.ofNullable(r4)
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.Object r4 = r4.orElse(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            org.apache.commons.io.monitor.FileAlterationObserver[] r0 = org.apache.commons.io.monitor.FileAlterationMonitor.EMPTY_ARRAY
            java.lang.Object[] r4 = r4.toArray(r0)
            org.apache.commons.io.monitor.FileAlterationObserver[] r4 = (org.apache.commons.io.monitor.FileAlterationObserver[]) r4
            r1.<init>(r2, r4)
            return
    }

    public FileAlterationMonitor(long r1, org.apache.commons.io.monitor.FileAlterationObserver... r3) {
            r0 = this;
            r0.<init>(r1)
            if (r3 == 0) goto L11
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda1 r2 = new org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r1.forEach(r2)
        L11:
            return
    }

    public void addObserver(org.apache.commons.io.monitor.FileAlterationObserver r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r0 = r1.observers
            r0.add(r2)
        L7:
            return
    }

    public long getInterval() {
            r2 = this;
            long r0 = r2.intervalMillis
            return r0
    }

    public java.lang.Iterable<org.apache.commons.io.monitor.FileAlterationObserver> getObservers() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r1 = r2.observers
            r0.<init>(r1)
            return r0
    }

    public void removeObserver(org.apache.commons.io.monitor.FileAlterationObserver r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r0 = r2.observers
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.removeIf(r1)
        Lf:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
        L0:
            boolean r0 = r2.running
            if (r0 == 0) goto L1d
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r0 = r2.observers
            org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.monitor.FileAlterationMonitor$$ExternalSyntheticLambda2
            r1.<init>()
            r0.forEach(r1)
            boolean r0 = r2.running
            if (r0 != 0) goto L13
            goto L1d
        L13:
            long r0 = r2.intervalMillis     // Catch: java.lang.InterruptedException -> L0
            java.time.Duration r0 = java.time.Duration.ofMillis(r0)     // Catch: java.lang.InterruptedException -> L0
            org.apache.commons.io.ThreadUtils.sleep(r0)     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L1d:
            return
    }

    public synchronized void setThreadFactory(java.util.concurrent.ThreadFactory r1) {
            r0 = this;
            monitor-enter(r0)
            r0.threadFactory = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void start() throws java.lang.Exception {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.running     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L37
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r0 = r2.observers     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3f
            org.apache.commons.io.monitor.FileAlterationObserver r1 = (org.apache.commons.io.monitor.FileAlterationObserver) r1     // Catch: java.lang.Throwable -> L3f
            r1.initialize()     // Catch: java.lang.Throwable -> L3f
            goto Lb
        L1b:
            r0 = 1
            r2.running = r0     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.ThreadFactory r0 = r2.threadFactory     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L29
            java.lang.Thread r0 = r0.newThread(r2)     // Catch: java.lang.Throwable -> L3f
            r2.thread = r0     // Catch: java.lang.Throwable -> L3f
            goto L30
        L29:
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r2.thread = r0     // Catch: java.lang.Throwable -> L3f
        L30:
            java.lang.Thread r0 = r2.thread     // Catch: java.lang.Throwable -> L3f
            r0.start()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            return
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Monitor is already running"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
    }

    public synchronized void stop() throws java.lang.Exception {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.intervalMillis     // Catch: java.lang.Throwable -> L8
            r2.stop(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public synchronized void stop(long r2) throws java.lang.Exception {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.running     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L32
            r0 = 0
            r1.running = r0     // Catch: java.lang.Throwable -> L3a
            java.lang.Thread r0 = r1.thread     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L3a
            r0.interrupt()     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L3a
            java.lang.Thread r0 = r1.thread     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L3a
            r0.join(r2)     // Catch: java.lang.InterruptedException -> L13 java.lang.Throwable -> L3a
            goto L1a
        L13:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3a
            r2.interrupt()     // Catch: java.lang.Throwable -> L3a
        L1a:
            java.util.List<org.apache.commons.io.monitor.FileAlterationObserver> r2 = r1.observers     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L20:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            org.apache.commons.io.monitor.FileAlterationObserver r3 = (org.apache.commons.io.monitor.FileAlterationObserver) r3     // Catch: java.lang.Throwable -> L3a
            r3.destroy()     // Catch: java.lang.Throwable -> L3a
            goto L20
        L30:
            monitor-exit(r1)
            return
        L32:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "Monitor is not running"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            throw r2     // Catch: java.lang.Throwable -> L3a
        L3a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r2
    }
}
