package org.apache.commons.lang3.concurrent;

import java.lang.Exception;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractConcurrentInitializer<T, E extends java.lang.Exception> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private final org.apache.commons.lang3.function.FailableConsumer<? super T, ? extends java.lang.Exception> closer;
    private final org.apache.commons.lang3.function.FailableSupplier<? extends T, ? extends java.lang.Exception> initializer;

    public static abstract class AbstractBuilder<I extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer<T, E>, T, B extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder<I, T, B, E>, E extends java.lang.Exception> extends org.apache.commons.lang3.builder.AbstractSupplier<I, B, E> {
        private org.apache.commons.lang3.function.FailableConsumer<T, ? extends java.lang.Exception> closer;
        private org.apache.commons.lang3.function.FailableSupplier<T, ? extends java.lang.Exception> initializer;

        public AbstractBuilder() {
                r1 = this;
                r1.<init>()
                org.apache.commons.lang3.function.FailableConsumer r0 = org.apache.commons.lang3.function.FailableConsumer.nop()
                r1.closer = r0
                org.apache.commons.lang3.function.FailableSupplier r0 = org.apache.commons.lang3.function.FailableSupplier.nul()
                r1.initializer = r0
                return
        }

        public org.apache.commons.lang3.function.FailableConsumer<T, ? extends java.lang.Exception> getCloser() {
                r1 = this;
                org.apache.commons.lang3.function.FailableConsumer<T, ? extends java.lang.Exception> r0 = r1.closer
                return r0
        }

        public org.apache.commons.lang3.function.FailableSupplier<T, ? extends java.lang.Exception> getInitializer() {
                r1 = this;
                org.apache.commons.lang3.function.FailableSupplier<T, ? extends java.lang.Exception> r0 = r1.initializer
                return r0
        }

        public B setCloser(org.apache.commons.lang3.function.FailableConsumer<T, ? extends java.lang.Exception> r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L7
            L3:
                org.apache.commons.lang3.function.FailableConsumer r1 = org.apache.commons.lang3.function.FailableConsumer.nop()
            L7:
                r0.closer = r1
                org.apache.commons.lang3.builder.AbstractSupplier r1 = r0.asThis()
                org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer$AbstractBuilder r1 = (org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder) r1
                return r1
        }

        public B setInitializer(org.apache.commons.lang3.function.FailableSupplier<T, ? extends java.lang.Exception> r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L7
            L3:
                org.apache.commons.lang3.function.FailableSupplier r1 = org.apache.commons.lang3.function.FailableSupplier.nul()
            L7:
                r0.initializer = r1
                org.apache.commons.lang3.builder.AbstractSupplier r1 = r0.asThis()
                org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer$AbstractBuilder r1 = (org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder) r1
                return r1
        }
    }

    public AbstractConcurrentInitializer() {
            r2 = this;
            org.apache.commons.lang3.function.FailableSupplier r0 = org.apache.commons.lang3.function.FailableSupplier.nul()
            org.apache.commons.lang3.function.FailableConsumer r1 = org.apache.commons.lang3.function.FailableConsumer.nop()
            r2.<init>(r0, r1)
            return
    }

    AbstractConcurrentInitializer(org.apache.commons.lang3.function.FailableSupplier<? extends T, ? extends java.lang.Exception> r2, org.apache.commons.lang3.function.FailableConsumer<? super T, ? extends java.lang.Exception> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "closer"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            org.apache.commons.lang3.function.FailableConsumer r3 = (org.apache.commons.lang3.function.FailableConsumer) r3
            r1.closer = r3
            java.lang.String r3 = "initializer"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r3)
            org.apache.commons.lang3.function.FailableSupplier r2 = (org.apache.commons.lang3.function.FailableSupplier) r2
            r1.initializer = r2
            return
    }

    public void close() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r2 = this;
            boolean r0 = r2.isInitialized()
            if (r0 == 0) goto L1b
            org.apache.commons.lang3.function.FailableConsumer<? super T, ? extends java.lang.Exception> r0 = r2.closer     // Catch: java.lang.Exception -> L10
            java.lang.Object r1 = r2.get()     // Catch: java.lang.Exception -> L10
            r0.accept(r1)     // Catch: java.lang.Exception -> L10
            goto L1b
        L10:
            r0 = move-exception
            org.apache.commons.lang3.concurrent.ConcurrentException r1 = new org.apache.commons.lang3.concurrent.ConcurrentException
            java.lang.Throwable r0 = org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r0)
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    protected abstract E getTypedException(java.lang.Exception r1);

    protected T initialize() throws java.lang.Exception {
            r4 = this;
            org.apache.commons.lang3.function.FailableSupplier<? extends T, ? extends java.lang.Exception> r0 = r4.initializer     // Catch: java.lang.Exception -> L7
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r0)
            java.lang.Exception r1 = r4.getTypedException(r0)
            java.lang.Class r2 = r1.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L1e
            throw r0
        L1e:
            throw r1
    }

    protected abstract boolean isInitialized();
}
