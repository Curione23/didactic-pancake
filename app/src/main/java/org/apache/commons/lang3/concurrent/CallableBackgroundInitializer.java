package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class CallableBackgroundInitializer<T> extends org.apache.commons.lang3.concurrent.BackgroundInitializer<T> {
    private final java.util.concurrent.Callable<T> callable;

    public CallableBackgroundInitializer(java.util.concurrent.Callable<T> r1) {
            r0 = this;
            r0.<init>()
            r0.checkCallable(r1)
            r0.callable = r1
            return
    }

    public CallableBackgroundInitializer(java.util.concurrent.Callable<T> r1, java.util.concurrent.ExecutorService r2) {
            r0 = this;
            r0.<init>(r2)
            r0.checkCallable(r1)
            r0.callable = r1
            return
    }

    private void checkCallable(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.lang.String r0 = "callable"
            java.util.Objects.requireNonNull(r2, r0)
            return
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer, org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected java.lang.Exception getTypedException(java.lang.Exception r2) {
            r1 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected T initialize() throws java.lang.Exception {
            r1 = this;
            java.util.concurrent.Callable<T> r0 = r1.callable
            java.lang.Object r0 = r0.call()
            return r0
    }
}
