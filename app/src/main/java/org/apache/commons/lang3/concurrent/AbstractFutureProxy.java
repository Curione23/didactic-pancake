package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFutureProxy<V> implements java.util.concurrent.Future<V> {
    private final java.util.concurrent.Future<V> future;

    public AbstractFutureProxy(java.util.concurrent.Future<V> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "future"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r1.future = r2
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public V get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    public java.util.concurrent.Future<V> getFuture() {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            java.util.concurrent.Future<V> r0 = r1.future
            boolean r0 = r0.isDone()
            return r0
    }
}
