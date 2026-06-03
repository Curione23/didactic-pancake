package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class LazyInitializer<T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer<T, org.apache.commons.lang3.concurrent.ConcurrentException> {
    private static final java.lang.Object NO_INIT = null;
    private volatile T object;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.LazyInitializer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder<I extends org.apache.commons.lang3.concurrent.LazyInitializer<T>, T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder<I, T, org.apache.commons.lang3.concurrent.LazyInitializer.Builder<I, T>, org.apache.commons.lang3.concurrent.ConcurrentException> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.lang.Throwable {
                r1 = this;
                org.apache.commons.lang3.concurrent.LazyInitializer r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
                r4 = this;
                org.apache.commons.lang3.concurrent.LazyInitializer r0 = new org.apache.commons.lang3.concurrent.LazyInitializer
                org.apache.commons.lang3.function.FailableSupplier r1 = r4.getInitializer()
                org.apache.commons.lang3.function.FailableConsumer r2 = r4.getCloser()
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT = r0
            return
    }

    public LazyInitializer() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            r1.object = r0
            return
    }

    private LazyInitializer(org.apache.commons.lang3.function.FailableSupplier<T, org.apache.commons.lang3.concurrent.ConcurrentException> r1, org.apache.commons.lang3.function.FailableConsumer<T, org.apache.commons.lang3.concurrent.ConcurrentException> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            r0.object = r1
            return
    }

    /* synthetic */ LazyInitializer(org.apache.commons.lang3.function.FailableSupplier r1, org.apache.commons.lang3.function.FailableConsumer r2, org.apache.commons.lang3.concurrent.LazyInitializer.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> org.apache.commons.lang3.concurrent.LazyInitializer.Builder<org.apache.commons.lang3.concurrent.LazyInitializer<T>, T> builder() {
            org.apache.commons.lang3.concurrent.LazyInitializer$Builder r0 = new org.apache.commons.lang3.concurrent.LazyInitializer$Builder
            r0.<init>()
            return r0
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r2 = this;
            T r0 = r2.object
            java.lang.Object r1 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            if (r0 != r1) goto L16
            monitor-enter(r2)
            T r0 = r2.object     // Catch: java.lang.Throwable -> L13
            if (r0 != r1) goto L11
            java.lang.Object r0 = r2.initialize()     // Catch: java.lang.Throwable -> L13
            r2.object = r0     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        L16:
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected /* bridge */ /* synthetic */ java.lang.Exception getTypedException(java.lang.Exception r1) {
            r0 = this;
            org.apache.commons.lang3.concurrent.ConcurrentException r1 = r0.getTypedException(r1)
            return r1
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected org.apache.commons.lang3.concurrent.ConcurrentException getTypedException(java.lang.Exception r2) {
            r1 = this;
            org.apache.commons.lang3.concurrent.ConcurrentException r0 = new org.apache.commons.lang3.concurrent.ConcurrentException
            r0.<init>(r2)
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public boolean isInitialized() {
            r2 = this;
            T r0 = r2.object
            java.lang.Object r1 = org.apache.commons.lang3.concurrent.LazyInitializer.NO_INIT
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
