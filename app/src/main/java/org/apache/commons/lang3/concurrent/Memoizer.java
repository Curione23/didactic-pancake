package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class Memoizer<I, O> implements org.apache.commons.lang3.concurrent.Computable<I, O> {
    private final java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> cache;
    private final java.util.function.Function<? super I, ? extends java.util.concurrent.Future<O>> mappingFunction;
    private final boolean recalculate;

    public Memoizer(java.util.function.Function<I, O> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Memoizer(java.util.function.Function<I, O> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cache = r0
            r1.recalculate = r3
            org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda3 r3 = new org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda3
            r3.<init>(r2)
            r1.mappingFunction = r3
            return
    }

    public Memoizer(org.apache.commons.lang3.concurrent.Computable<I, O> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Memoizer(org.apache.commons.lang3.concurrent.Computable<I, O> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cache = r0
            r1.recalculate = r3
            org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0 r3 = new org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r1.mappingFunction = r3
            return
    }

    static /* synthetic */ java.lang.Object lambda$new$0(org.apache.commons.lang3.concurrent.Computable r0, java.lang.Object r1) throws java.lang.Exception {
            java.lang.Object r0 = r0.compute(r1)
            return r0
    }

    static /* synthetic */ java.util.concurrent.Future lambda$new$1(org.apache.commons.lang3.concurrent.Computable r1, java.lang.Object r2) {
            org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            java.util.concurrent.FutureTask r1 = org.apache.commons.lang3.concurrent.FutureTasks.run(r0)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$new$2(java.util.function.Function r0, java.lang.Object r1) throws java.lang.Exception {
            java.lang.Object r0 = r0.apply(r1)
            return r0
    }

    static /* synthetic */ java.util.concurrent.Future lambda$new$3(java.util.function.Function r1, java.lang.Object r2) {
            org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            java.util.concurrent.FutureTask r1 = org.apache.commons.lang3.concurrent.FutureTasks.run(r0)
            return r1
    }

    private java.lang.RuntimeException launderException(java.lang.Throwable r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unchecked exception"
            java.lang.Throwable r3 = org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r3)
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(I r4) throws java.lang.InterruptedException {
            r3 = this;
        L0:
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r0 = r3.cache
            java.util.function.Function<? super I, ? extends java.util.concurrent.Future<O>> r1 = r3.mappingFunction
            java.lang.Object r0 = r0.computeIfAbsent(r4, r1)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.lang.Object r4 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> Lf java.util.concurrent.CancellationException -> L22
            return r4
        Lf:
            r1 = move-exception
            boolean r2 = r3.recalculate
            if (r2 == 0) goto L19
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r2 = r3.cache
            r2.remove(r4, r0)
        L19:
            java.lang.Throwable r4 = r1.getCause()
            java.lang.RuntimeException r4 = r3.launderException(r4)
            throw r4
        L22:
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r1 = r3.cache
            r1.remove(r4, r0)
            goto L0
    }
}
