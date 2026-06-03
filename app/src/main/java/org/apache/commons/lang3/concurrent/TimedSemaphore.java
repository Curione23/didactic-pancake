package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class TimedSemaphore {
    public static final int NO_LIMIT = 0;
    private static final int THREAD_POOL_SIZE = 1;
    private int acquireCount;
    private final java.util.concurrent.ScheduledExecutorService executorService;
    private int lastCallsPerPeriod;
    private int limit;
    private final boolean ownExecutor;
    private final long period;
    private long periodCount;
    private boolean shutdown;
    private java.util.concurrent.ScheduledFuture<?> task;
    private long totalAcquireCount;
    private final java.util.concurrent.TimeUnit unit;

    public TimedSemaphore(long r7, java.util.concurrent.TimeUnit r9, int r10) {
            r6 = this;
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public TimedSemaphore(java.util.concurrent.ScheduledExecutorService r8, long r9, java.util.concurrent.TimeUnit r11, int r12) {
            r7 = this;
            r7.<init>()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r6 = "Time period must be greater than 0!"
            r0 = 1
            r4 = r9
            org.apache.commons.lang3.Validate.inclusiveBetween(r0, r2, r4, r6)
            r7.period = r9
            r7.unit = r11
            r9 = 0
            if (r8 == 0) goto L1c
            r7.executorService = r8
            r7.ownExecutor = r9
            goto L2c
        L1c:
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r10 = 1
            r8.<init>(r10)
            r8.setContinueExistingPeriodicTasksAfterShutdownPolicy(r9)
            r8.setExecuteExistingDelayedTasksAfterShutdownPolicy(r9)
            r7.executorService = r8
            r7.ownExecutor = r10
        L2c:
            r7.setLimit(r12)
            return
    }

    private boolean acquirePermit() {
            r2 = this;
            int r0 = r2.getLimit()
            if (r0 <= 0) goto L11
            int r0 = r2.acquireCount
            int r1 = r2.getLimit()
            if (r0 >= r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            int r0 = r2.acquireCount
            r1 = 1
            int r0 = r0 + r1
            r2.acquireCount = r0
            return r1
    }

    private void prepareAcquire() {
            r2 = this;
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L11
            java.util.concurrent.ScheduledFuture<?> r0 = r2.task
            if (r0 != 0) goto L10
            java.util.concurrent.ScheduledFuture r0 = r2.startTimer()
            r2.task = r0
        L10:
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TimedSemaphore is shut down!"
            r0.<init>(r1)
            throw r0
    }

    public synchronized void acquire() throws java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
            r1.prepareAcquire()     // Catch: java.lang.Throwable -> L11
        L4:
            boolean r0 = r1.acquirePermit()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Ld
            r1.wait()     // Catch: java.lang.Throwable -> L11
        Ld:
            if (r0 == 0) goto L4
            monitor-exit(r1)
            return
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    synchronized void endOfPeriod() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.acquireCount     // Catch: java.lang.Throwable -> L1a
            r5.lastCallsPerPeriod = r0     // Catch: java.lang.Throwable -> L1a
            long r1 = r5.totalAcquireCount     // Catch: java.lang.Throwable -> L1a
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L1a
            long r1 = r1 + r3
            r5.totalAcquireCount = r1     // Catch: java.lang.Throwable -> L1a
            long r0 = r5.periodCount     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            long r0 = r0 + r2
            r5.periodCount = r0     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            r5.acquireCount = r0     // Catch: java.lang.Throwable -> L1a
            r5.notifyAll()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public synchronized int getAcquireCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.acquireCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized int getAvailablePermits() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.getLimit()     // Catch: java.lang.Throwable -> Lc
            int r1 = r2.getAcquireCount()     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 - r1
            monitor-exit(r2)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public synchronized double getAverageCallsPerPeriod() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.periodCount     // Catch: java.lang.Throwable -> L14
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc
            r0 = 0
            goto L12
        Lc:
            long r2 = r4.totalAcquireCount     // Catch: java.lang.Throwable -> L14
            double r2 = (double) r2
            double r0 = (double) r0
            double r0 = r2 / r0
        L12:
            monitor-exit(r4)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    protected java.util.concurrent.ScheduledExecutorService getExecutorService() {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.executorService
            return r0
    }

    public synchronized int getLastAcquiresPerPeriod() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.lastCallsPerPeriod     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int getLimit() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.limit     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public long getPeriod() {
            r2 = this;
            long r0 = r2.period
            return r0
    }

    public java.util.concurrent.TimeUnit getUnit() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.unit
            return r0
    }

    public synchronized boolean isShutdown() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.shutdown     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized void setLimit(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.limit = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized void shutdown() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.shutdown     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1b
            boolean r0 = r2.ownExecutor     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L10
            java.util.concurrent.ScheduledExecutorService r0 = r2.getExecutorService()     // Catch: java.lang.Throwable -> L1d
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L1d
        L10:
            java.util.concurrent.ScheduledFuture<?> r0 = r2.task     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L18
            r1 = 0
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L1d
        L18:
            r0 = 1
            r2.shutdown = r0     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    protected java.util.concurrent.ScheduledFuture<?> startTimer() {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.getExecutorService()
            org.apache.commons.lang3.concurrent.TimedSemaphore$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.concurrent.TimedSemaphore$$ExternalSyntheticLambda0
            r1.<init>(r7)
            long r2 = r7.getPeriod()
            long r4 = r7.getPeriod()
            java.util.concurrent.TimeUnit r6 = r7.getUnit()
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r0
    }

    public synchronized boolean tryAcquire() {
            r1 = this;
            monitor-enter(r1)
            r1.prepareAcquire()     // Catch: java.lang.Throwable -> La
            boolean r0 = r1.acquirePermit()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}
