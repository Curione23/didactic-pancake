package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class Functions {

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableBiConsumer<O1, O2, T extends java.lang.Throwable> {
        void accept(O1 r1, O2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableBiFunction<O1, O2, R, T extends java.lang.Throwable> {
        R apply(O1 r1, O2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableBiPredicate<O1, O2, T extends java.lang.Throwable> {
        boolean test(O1 r1, O2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableCallable<R, T extends java.lang.Throwable> {
        R call() throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableConsumer<O, T extends java.lang.Throwable> {
        void accept(O r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableFunction<I, R, T extends java.lang.Throwable> {
        R apply(I r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailablePredicate<I, T extends java.lang.Throwable> {
        boolean test(I r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableRunnable<T extends java.lang.Throwable> {
        void run() throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface FailableSupplier<R, T extends java.lang.Throwable> {
        R get() throws java.lang.Throwable;
    }

    public Functions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <O1, O2, T extends java.lang.Throwable> void accept(org.apache.commons.lang3.Functions.FailableBiConsumer<O1, O2, T> r1, O1 r2, O2 r3) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda1
            r0.<init>(r1, r2, r3)
            run(r0)
            return
    }

    public static <O, T extends java.lang.Throwable> void accept(org.apache.commons.lang3.Functions.FailableConsumer<O, T> r1, O r2) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda14 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda14
            r0.<init>(r1, r2)
            run(r0)
            return
    }

    public static <O1, O2, O, T extends java.lang.Throwable> O apply(org.apache.commons.lang3.Functions.FailableBiFunction<O1, O2, O, T> r1, O1 r2, O2 r3) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda2
            r0.<init>(r1, r2, r3)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <I, O, T extends java.lang.Throwable> O apply(org.apache.commons.lang3.Functions.FailableFunction<I, O, T> r1, I r2) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11
            r0.<init>(r1, r2)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <O1, O2> java.util.function.BiConsumer<O1, O2> asBiConsumer(org.apache.commons.lang3.Functions.FailableBiConsumer<O1, O2, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8
            r0.<init>(r1)
            return r0
    }

    public static <O1, O2, O> java.util.function.BiFunction<O1, O2, O> asBiFunction(org.apache.commons.lang3.Functions.FailableBiFunction<O1, O2, O, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda12 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda12
            r0.<init>(r1)
            return r0
    }

    public static <O1, O2> java.util.function.BiPredicate<O1, O2> asBiPredicate(org.apache.commons.lang3.Functions.FailableBiPredicate<O1, O2, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    public static <O> java.util.concurrent.Callable<O> asCallable(org.apache.commons.lang3.Functions.FailableCallable<O, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda10 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda10
            r0.<init>(r1)
            return r0
    }

    public static <I> java.util.function.Consumer<I> asConsumer(org.apache.commons.lang3.Functions.FailableConsumer<I, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda6 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda6
            r0.<init>(r1)
            return r0
    }

    public static <I, O> java.util.function.Function<I, O> asFunction(org.apache.commons.lang3.Functions.FailableFunction<I, O, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda3
            r0.<init>(r1)
            return r0
    }

    public static <I> java.util.function.Predicate<I> asPredicate(org.apache.commons.lang3.Functions.FailablePredicate<I, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Runnable asRunnable(org.apache.commons.lang3.Functions.FailableRunnable<?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda16 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda16
            r0.<init>(r1)
            return r0
    }

    public static <O> java.util.function.Supplier<O> asSupplier(org.apache.commons.lang3.Functions.FailableSupplier<O, ?> r1) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda13 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda13
            r0.<init>(r1)
            return r0
    }

    public static <O, T extends java.lang.Throwable> O call(org.apache.commons.lang3.Functions.FailableCallable<O, T> r1) {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda9 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda9
            r0.<init>(r1)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <O, T extends java.lang.Throwable> O get(org.apache.commons.lang3.Functions.FailableSupplier<O, T> r0) {
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    private static <T extends java.lang.Throwable> boolean getAsBoolean(org.apache.commons.lang3.function.FailableBooleanSupplier<T> r0) {
            boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static /* synthetic */ void lambda$accept$0(org.apache.commons.lang3.Functions.FailableBiConsumer r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            r0.accept(r1, r2)
            return
    }

    static /* synthetic */ void lambda$accept$1(org.apache.commons.lang3.Functions.FailableConsumer r0, java.lang.Object r1) throws java.lang.Throwable {
            r0.accept(r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$apply$2(org.apache.commons.lang3.Functions.FailableBiFunction r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            java.lang.Object r0 = r0.apply(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$apply$3(org.apache.commons.lang3.Functions.FailableFunction r0, java.lang.Object r1) throws java.lang.Throwable {
            java.lang.Object r0 = r0.apply(r1)
            return r0
    }

    static /* synthetic */ void lambda$asBiConsumer$4(org.apache.commons.lang3.Functions.FailableBiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
            accept(r0, r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asBiFunction$5(org.apache.commons.lang3.Functions.FailableBiFunction r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ boolean lambda$asBiPredicate$6(org.apache.commons.lang3.Functions.FailableBiPredicate r0, java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = test(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$asCallable$7(org.apache.commons.lang3.Functions.FailableCallable r0) throws java.lang.Exception {
            java.lang.Object r0 = call(r0)
            return r0
    }

    static /* synthetic */ void lambda$asConsumer$8(org.apache.commons.lang3.Functions.FailableConsumer r0, java.lang.Object r1) {
            accept(r0, r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asFunction$9(org.apache.commons.lang3.Functions.FailableFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = apply(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$asPredicate$10(org.apache.commons.lang3.Functions.FailablePredicate r0, java.lang.Object r1) {
            boolean r0 = test(r0, r1)
            return r0
    }

    static /* synthetic */ void lambda$asRunnable$11(org.apache.commons.lang3.Functions.FailableRunnable r0) {
            run(r0)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asSupplier$12(org.apache.commons.lang3.Functions.FailableSupplier r0) {
            java.lang.Object r0 = get(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$test$13(org.apache.commons.lang3.Functions.FailableBiPredicate r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            boolean r0 = r0.test(r1, r2)
            return r0
    }

    static /* synthetic */ boolean lambda$test$14(org.apache.commons.lang3.Functions.FailablePredicate r0, java.lang.Object r1) throws java.lang.Throwable {
            boolean r0 = r0.test(r1)
            return r0
    }

    static /* synthetic */ void lambda$tryWithResources$15(org.apache.commons.lang3.Functions.FailableRunnable[] r0, int r1) throws java.lang.Throwable {
            r0 = r0[r1]
            r0.run()
            return
    }

    static /* synthetic */ org.apache.commons.lang3.function.FailableRunnable lambda$tryWithResources$16(org.apache.commons.lang3.Functions.FailableRunnable[] r1, int r2) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda15 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda15
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.RuntimeException rethrow(java.lang.Throwable r1) {
            java.lang.String r0 = "throwable"
            java.util.Objects.requireNonNull(r1, r0)
            org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r1)
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L14
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.reflect.UndeclaredThrowableException r0 = new java.lang.reflect.UndeclaredThrowableException
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.Throwable> void run(org.apache.commons.lang3.Functions.FailableRunnable<T> r0) {
            r0.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <O> org.apache.commons.lang3.Streams.FailableStream<O> stream(java.util.Collection<O> r1) {
            org.apache.commons.lang3.Streams$FailableStream r0 = new org.apache.commons.lang3.Streams$FailableStream
            java.util.stream.Stream r1 = r1.stream()
            r0.<init>(r1)
            return r0
    }

    public static <O> org.apache.commons.lang3.Streams.FailableStream<O> stream(java.util.stream.Stream<O> r1) {
            org.apache.commons.lang3.Streams$FailableStream r0 = new org.apache.commons.lang3.Streams$FailableStream
            r0.<init>(r1)
            return r0
    }

    public static <O1, O2, T extends java.lang.Throwable> boolean test(org.apache.commons.lang3.Functions.FailableBiPredicate<O1, O2, T> r1, O1 r2, O2 r3) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda5
            r0.<init>(r1, r2, r3)
            boolean r1 = getAsBoolean(r0)
            return r1
    }

    public static <O, T extends java.lang.Throwable> boolean test(org.apache.commons.lang3.Functions.FailablePredicate<O, T> r1, O r2) {
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda7
            r0.<init>(r1, r2)
            boolean r1 = getAsBoolean(r0)
            return r1
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable> r2, org.apache.commons.lang3.Functions.FailableConsumer<java.lang.Throwable, ? extends java.lang.Throwable> r3, org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable>... r4) {
            int r0 = r4.length
            org.apache.commons.lang3.function.FailableRunnable[] r0 = new org.apache.commons.lang3.function.FailableRunnable[r0]
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda17 r1 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda17
            r1.<init>(r4)
            java.util.Arrays.setAll(r0, r1)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda18 r4 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda18
            r4.<init>(r2)
            if (r3 == 0) goto L1e
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19 r2 = new org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19
            r2.<init>(r3)
            goto L1f
        L1e:
            r2 = 0
        L1f:
            org.apache.commons.lang3.function.Failable.tryWithResources(r4, r2, r0)
            return
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable> r1, org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable>... r2) {
            r0 = 0
            tryWithResources(r1, r0, r2)
            return
    }
}
