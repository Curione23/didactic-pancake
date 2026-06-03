package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class BackgroundInitializer<T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer<T, java.lang.Exception> {
    private java.util.concurrent.ExecutorService executor;
    private java.util.concurrent.ExecutorService externalExecutor;
    private java.util.concurrent.Future<T> future;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.BackgroundInitializer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder<I extends org.apache.commons.lang3.concurrent.BackgroundInitializer<T>, T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder<I, T, org.apache.commons.lang3.concurrent.BackgroundInitializer.Builder<I, T>, java.lang.Exception> {
        private java.util.concurrent.ExecutorService externalExecutor;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.lang.Throwable {
                r1 = this;
                org.apache.commons.lang3.concurrent.BackgroundInitializer r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
                r5 = this;
                org.apache.commons.lang3.concurrent.BackgroundInitializer r0 = new org.apache.commons.lang3.concurrent.BackgroundInitializer
                org.apache.commons.lang3.function.FailableSupplier r1 = r5.getInitializer()
                org.apache.commons.lang3.function.FailableConsumer r2 = r5.getCloser()
                java.util.concurrent.ExecutorService r3 = r5.externalExecutor
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public org.apache.commons.lang3.concurrent.BackgroundInitializer.Builder<I, T> setExternalExecutor(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.externalExecutor = r1
                org.apache.commons.lang3.builder.AbstractSupplier r1 = r0.asThis()
                org.apache.commons.lang3.concurrent.BackgroundInitializer$Builder r1 = (org.apache.commons.lang3.concurrent.BackgroundInitializer.Builder) r1
                return r1
        }
    }

    private final class InitializationTask implements java.util.concurrent.Callable<T> {
        private final java.util.concurrent.ExecutorService execFinally;
        final /* synthetic */ org.apache.commons.lang3.concurrent.BackgroundInitializer this$0;

        InitializationTask(org.apache.commons.lang3.concurrent.BackgroundInitializer r1, java.util.concurrent.ExecutorService r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.execFinally = r2
                return
        }

        @Override // java.util.concurrent.Callable
        public T call() throws java.lang.Exception {
                r2 = this;
                org.apache.commons.lang3.concurrent.BackgroundInitializer r0 = r2.this$0     // Catch: java.lang.Throwable -> Le
                java.lang.Object r0 = r0.initialize()     // Catch: java.lang.Throwable -> Le
                java.util.concurrent.ExecutorService r1 = r2.execFinally
                if (r1 == 0) goto Ld
                r1.shutdown()
            Ld:
                return r0
            Le:
                r0 = move-exception
                java.util.concurrent.ExecutorService r1 = r2.execFinally
                if (r1 == 0) goto L16
                r1.shutdown()
            L16:
                throw r0
        }
    }

    protected BackgroundInitializer() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    protected BackgroundInitializer(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.setExternalExecutor(r1)
            return
    }

    private BackgroundInitializer(org.apache.commons.lang3.function.FailableSupplier<T, org.apache.commons.lang3.concurrent.ConcurrentException> r1, org.apache.commons.lang3.function.FailableConsumer<T, org.apache.commons.lang3.concurrent.ConcurrentException> r2, java.util.concurrent.ExecutorService r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setExternalExecutor(r3)
            return
    }

    /* synthetic */ BackgroundInitializer(org.apache.commons.lang3.function.FailableSupplier r1, org.apache.commons.lang3.function.FailableConsumer r2, java.util.concurrent.ExecutorService r3, org.apache.commons.lang3.concurrent.BackgroundInitializer.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static <T> org.apache.commons.lang3.concurrent.BackgroundInitializer.Builder<org.apache.commons.lang3.concurrent.BackgroundInitializer<T>, T> builder() {
            org.apache.commons.lang3.concurrent.BackgroundInitializer$Builder r0 = new org.apache.commons.lang3.concurrent.BackgroundInitializer$Builder
            r0.<init>()
            return r0
    }

    private java.util.concurrent.ExecutorService createExecutor() {
            r1 = this;
            int r0 = r1.getTaskCount()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            return r0
    }

    private java.util.concurrent.Callable<T> createTask(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            org.apache.commons.lang3.concurrent.BackgroundInitializer$InitializationTask r0 = new org.apache.commons.lang3.concurrent.BackgroundInitializer$InitializationTask
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r2 = this;
            java.util.concurrent.Future r0 = r2.getFuture()     // Catch: java.lang.InterruptedException -> L9 java.util.concurrent.ExecutionException -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L9 java.util.concurrent.ExecutionException -> L17
            return r0
        L9:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            org.apache.commons.lang3.concurrent.ConcurrentException r1 = new org.apache.commons.lang3.concurrent.ConcurrentException
            r1.<init>(r0)
            throw r1
        L17:
            r0 = move-exception
            org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(r0)
            r0 = 0
            return r0
    }

    protected final synchronized java.util.concurrent.ExecutorService getActiveExecutor() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r1.executor     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized java.util.concurrent.ExecutorService getExternalExecutor() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = r1.externalExecutor     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized java.util.concurrent.Future<T> getFuture() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<T> r0 = r2.future     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "start() must be called first!"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected int getTaskCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected java.lang.Exception getTypedException(java.lang.Exception r2) {
            r1 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public synchronized boolean isInitialized() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<T> r0 = r2.future     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            java.util.concurrent.Future<T> r0 = r2.future     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L19
            r0.get()     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L19
            monitor-exit(r2)
            r0 = 1
            return r0
        L15:
            monitor-exit(r2)
            return r1
        L17:
            monitor-exit(r2)
            return r1
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public synchronized boolean isStarted() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.Future<T> r0 = r1.future     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public final synchronized void setExternalExecutor(java.util.concurrent.ExecutorService r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isStarted()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lb
            r1.externalExecutor = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "Cannot set ExecutorService after start()!"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public synchronized boolean start() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isStarted()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L26
            java.util.concurrent.ExecutorService r0 = r2.getExternalExecutor()     // Catch: java.lang.Throwable -> L29
            r2.executor = r0     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L16
            java.util.concurrent.ExecutorService r0 = r2.createExecutor()     // Catch: java.lang.Throwable -> L29
            r2.executor = r0     // Catch: java.lang.Throwable -> L29
            goto L17
        L16:
            r0 = 0
        L17:
            java.util.concurrent.ExecutorService r1 = r2.executor     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.Callable r0 = r2.createTask(r0)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.Throwable -> L29
            r2.future = r0     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)
            r0 = 1
            return r0
        L26:
            monitor-exit(r2)
            r0 = 0
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
    }
}
