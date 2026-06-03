package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class AtomicInitializer<T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer<T, org.apache.commons.lang3.concurrent.ConcurrentException> {
    private static final java.lang.Object NO_INIT = null;
    private final java.util.concurrent.atomic.AtomicReference<T> reference;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.AtomicInitializer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder<I extends org.apache.commons.lang3.concurrent.AtomicInitializer<T>, T> extends org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer.AbstractBuilder<I, T, org.apache.commons.lang3.concurrent.AtomicInitializer.Builder<I, T>, org.apache.commons.lang3.concurrent.ConcurrentException> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.lang.Throwable {
                r1 = this;
                org.apache.commons.lang3.concurrent.AtomicInitializer r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.lang3.function.FailableSupplier
        public I get() {
                r4 = this;
                org.apache.commons.lang3.concurrent.AtomicInitializer r0 = new org.apache.commons.lang3.concurrent.AtomicInitializer
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
            org.apache.commons.lang3.concurrent.AtomicInitializer.NO_INIT = r0
            return
    }

    public AtomicInitializer() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r1 = r2.getNoInit()
            r0.<init>(r1)
            r2.reference = r0
            return
    }

    private AtomicInitializer(org.apache.commons.lang3.function.FailableSupplier<T, org.apache.commons.lang3.concurrent.ConcurrentException> r1, org.apache.commons.lang3.function.FailableConsumer<T, org.apache.commons.lang3.concurrent.ConcurrentException> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r2 = r0.getNoInit()
            r1.<init>(r2)
            r0.reference = r1
            return
    }

    /* synthetic */ AtomicInitializer(org.apache.commons.lang3.function.FailableSupplier r1, org.apache.commons.lang3.function.FailableConsumer r2, org.apache.commons.lang3.concurrent.AtomicInitializer.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> org.apache.commons.lang3.concurrent.AtomicInitializer.Builder<org.apache.commons.lang3.concurrent.AtomicInitializer<T>, T> builder() {
            org.apache.commons.lang3.concurrent.AtomicInitializer$Builder r0 = new org.apache.commons.lang3.concurrent.AtomicInitializer$Builder
            r0.<init>()
            return r0
    }

    private T getNoInit() {
            r1 = this;
            java.lang.Object r0 = org.apache.commons.lang3.concurrent.AtomicInitializer.NO_INIT
            return r0
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<T> r0 = r3.reference
            java.lang.Object r0 = r0.get()
            java.lang.Object r1 = r3.getNoInit()
            if (r0 != r1) goto L22
            java.lang.Object r0 = r3.initialize()
            java.util.concurrent.atomic.AtomicReference<T> r1 = r3.reference
            java.lang.Object r2 = r3.getNoInit()
            boolean r1 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r0)
            if (r1 != 0) goto L22
            java.util.concurrent.atomic.AtomicReference<T> r0 = r3.reference
            java.lang.Object r0 = r0.get()
        L22:
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
            java.util.concurrent.atomic.AtomicReference<T> r0 = r2.reference
            java.lang.Object r0 = r0.get()
            java.lang.Object r1 = org.apache.commons.lang3.concurrent.AtomicInitializer.NO_INIT
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }
}
