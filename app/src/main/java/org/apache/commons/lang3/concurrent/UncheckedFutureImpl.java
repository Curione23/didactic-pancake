package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedFutureImpl<V> extends org.apache.commons.lang3.concurrent.AbstractFutureProxy<V> implements org.apache.commons.lang3.concurrent.UncheckedFuture<V> {
    UncheckedFutureImpl(java.util.concurrent.Future<V> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractFutureProxy, java.util.concurrent.Future
    public V get() {
            r2 = this;
            java.lang.Object r0 = super.get()     // Catch: java.util.concurrent.ExecutionException -> L5 java.lang.InterruptedException -> Lc
            return r0
        L5:
            r0 = move-exception
            org.apache.commons.lang3.concurrent.UncheckedExecutionException r1 = new org.apache.commons.lang3.concurrent.UncheckedExecutionException
            r1.<init>(r0)
            throw r1
        Lc:
            r0 = move-exception
            org.apache.commons.lang3.exception.UncheckedInterruptedException r1 = new org.apache.commons.lang3.exception.UncheckedInterruptedException
            r1.<init>(r0)
            throw r1
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractFutureProxy, java.util.concurrent.Future
    public V get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.Object r1 = super.get(r1, r3)     // Catch: java.util.concurrent.TimeoutException -> L5 java.util.concurrent.ExecutionException -> Lc java.lang.InterruptedException -> L13
            return r1
        L5:
            r1 = move-exception
            org.apache.commons.lang3.concurrent.UncheckedTimeoutException r2 = new org.apache.commons.lang3.concurrent.UncheckedTimeoutException
            r2.<init>(r1)
            throw r2
        Lc:
            r1 = move-exception
            org.apache.commons.lang3.concurrent.UncheckedExecutionException r2 = new org.apache.commons.lang3.concurrent.UncheckedExecutionException
            r2.<init>(r1)
            throw r2
        L13:
            r1 = move-exception
            org.apache.commons.lang3.exception.UncheckedInterruptedException r2 = new org.apache.commons.lang3.exception.UncheckedInterruptedException
            r2.<init>(r1)
            throw r2
    }
}
