package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
public class Failable {
    private Failable() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, U, E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableBiConsumer<T, U, E> r1, T r2, U r3) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda20 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda20
            r0.<init>(r1, r2, r3)
            run(r0)
            return
    }

    public static <T, E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableConsumer<T, E> r1, T r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda12 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda12
            r0.<init>(r1, r2)
            run(r0)
            return
    }

    public static <E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableDoubleConsumer<E> r1, double r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            run(r0)
            return
    }

    public static <E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableIntConsumer<E> r1, int r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda16 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda16
            r0.<init>(r1, r2)
            run(r0)
            return
    }

    public static <E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableLongConsumer<E> r1, long r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            run(r0)
            return
    }

    public static <T, U, R, E extends java.lang.Throwable> R apply(org.apache.commons.lang3.function.FailableBiFunction<T, U, R, E> r1, T r2, U r3) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda21 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda21
            r0.<init>(r1, r2, r3)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <T, R, E extends java.lang.Throwable> R apply(org.apache.commons.lang3.function.FailableFunction<T, R, E> r1, T r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda19 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda19
            r0.<init>(r1, r2)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <E extends java.lang.Throwable> double applyAsDouble(org.apache.commons.lang3.function.FailableDoubleBinaryOperator<E> r7, double r8, double r10) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda11 r6 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda11
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4)
            double r7 = getAsDouble(r6)
            return r7
    }

    public static <T, U> java.util.function.BiConsumer<T, U> asBiConsumer(org.apache.commons.lang3.function.FailableBiConsumer<T, U, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda15 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda15
            r0.<init>(r1)
            return r0
    }

    public static <T, U, R> java.util.function.BiFunction<T, U, R> asBiFunction(org.apache.commons.lang3.function.FailableBiFunction<T, U, R, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda8 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda8
            r0.<init>(r1)
            return r0
    }

    public static <T, U> java.util.function.BiPredicate<T, U> asBiPredicate(org.apache.commons.lang3.function.FailableBiPredicate<T, U, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public static <V> java.util.concurrent.Callable<V> asCallable(org.apache.commons.lang3.function.FailableCallable<V, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda10 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda10
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.function.Consumer<T> asConsumer(org.apache.commons.lang3.function.FailableConsumer<T, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda18 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda18
            r0.<init>(r1)
            return r0
    }

    public static <T, R> java.util.function.Function<T, R> asFunction(org.apache.commons.lang3.function.FailableFunction<T, R, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda14 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda14
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.function.Predicate<T> asPredicate(org.apache.commons.lang3.function.FailablePredicate<T, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda17 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda17
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Runnable asRunnable(org.apache.commons.lang3.function.FailableRunnable<?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda9 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda9
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.function.Supplier<T> asSupplier(org.apache.commons.lang3.function.FailableSupplier<T, ?> r1) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda6 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda6
            r0.<init>(r1)
            return r0
    }

    public static <V, E extends java.lang.Throwable> V call(org.apache.commons.lang3.function.FailableCallable<V, E> r1) {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda13 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda13
            r0.<init>(r1)
            java.lang.Object r1 = get(r0)
            return r1
    }

    public static <T, E extends java.lang.Throwable> T get(org.apache.commons.lang3.function.FailableSupplier<T, E> r0) {
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <E extends java.lang.Throwable> boolean getAsBoolean(org.apache.commons.lang3.function.FailableBooleanSupplier<E> r0) {
            boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <E extends java.lang.Throwable> double getAsDouble(org.apache.commons.lang3.function.FailableDoubleSupplier<E> r2) {
            double r0 = r2.getAsDouble()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r2 = move-exception
            java.lang.RuntimeException r2 = rethrow(r2)
            throw r2
    }

    public static <E extends java.lang.Throwable> int getAsInt(org.apache.commons.lang3.function.FailableIntSupplier<E> r0) {
            int r0 = r0.getAsInt()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <E extends java.lang.Throwable> long getAsLong(org.apache.commons.lang3.function.FailableLongSupplier<E> r2) {
            long r0 = r2.getAsLong()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r2 = move-exception
            java.lang.RuntimeException r2 = rethrow(r2)
            throw r2
    }

    public static <E extends java.lang.Throwable> short getAsShort(org.apache.commons.lang3.function.FailableShortSupplier<E> r0) {
            short r0 = r0.getAsShort()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static /* synthetic */ void lambda$accept$0(org.apache.commons.lang3.function.FailableBiConsumer r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            r0.accept(r1, r2)
            return
    }

    static /* synthetic */ void lambda$accept$1(org.apache.commons.lang3.function.FailableConsumer r0, java.lang.Object r1) throws java.lang.Throwable {
            r0.accept(r1)
            return
    }

    static /* synthetic */ void lambda$accept$2(org.apache.commons.lang3.function.FailableDoubleConsumer r0, double r1) throws java.lang.Throwable {
            r0.accept(r1)
            return
    }

    static /* synthetic */ void lambda$accept$3(org.apache.commons.lang3.function.FailableIntConsumer r0, int r1) throws java.lang.Throwable {
            r0.accept(r1)
            return
    }

    static /* synthetic */ void lambda$accept$4(org.apache.commons.lang3.function.FailableLongConsumer r0, long r1) throws java.lang.Throwable {
            r0.accept(r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$apply$5(org.apache.commons.lang3.function.FailableBiFunction r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            java.lang.Object r0 = r0.apply(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$apply$6(org.apache.commons.lang3.function.FailableFunction r0, java.lang.Object r1) throws java.lang.Throwable {
            java.lang.Object r0 = r0.apply(r1)
            return r0
    }

    static /* synthetic */ double lambda$applyAsDouble$7(org.apache.commons.lang3.function.FailableDoubleBinaryOperator r0, double r1, double r3) throws java.lang.Throwable {
            double r0 = r0.applyAsDouble(r1, r3)
            return r0
    }

    static /* synthetic */ void lambda$asBiConsumer$8(org.apache.commons.lang3.function.FailableBiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
            accept(r0, r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asBiFunction$9(org.apache.commons.lang3.function.FailableBiFunction r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ boolean lambda$asBiPredicate$10(org.apache.commons.lang3.function.FailableBiPredicate r0, java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = test(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$asCallable$11(org.apache.commons.lang3.function.FailableCallable r0) throws java.lang.Exception {
            java.lang.Object r0 = call(r0)
            return r0
    }

    static /* synthetic */ void lambda$asConsumer$12(org.apache.commons.lang3.function.FailableConsumer r0, java.lang.Object r1) {
            accept(r0, r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asFunction$13(org.apache.commons.lang3.function.FailableFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = apply(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$asPredicate$14(org.apache.commons.lang3.function.FailablePredicate r0, java.lang.Object r1) {
            boolean r0 = test(r0, r1)
            return r0
    }

    static /* synthetic */ void lambda$asRunnable$15(org.apache.commons.lang3.function.FailableRunnable r0) {
            run(r0)
            return
    }

    static /* synthetic */ java.lang.Object lambda$asSupplier$16(org.apache.commons.lang3.function.FailableSupplier r0) {
            java.lang.Object r0 = get(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$test$17(org.apache.commons.lang3.function.FailableBiPredicate r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            boolean r0 = r0.test(r1, r2)
            return r0
    }

    static /* synthetic */ boolean lambda$test$18(org.apache.commons.lang3.function.FailablePredicate r0, java.lang.Object r1) throws java.lang.Throwable {
            boolean r0 = r0.test(r1)
            return r0
    }

    static /* synthetic */ void lambda$tryWithResources$19(org.apache.commons.lang3.function.FailableRunnable r1) {
            java.lang.String r0 = "runnable"
            java.util.Objects.requireNonNull(r1, r0)
            return
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

    public static <E extends java.lang.Throwable> void run(org.apache.commons.lang3.function.FailableRunnable<E> r0) {
            r0.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <E> org.apache.commons.lang3.stream.Streams.FailableStream<E> stream(java.util.Collection<E> r1) {
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = new org.apache.commons.lang3.stream.Streams$FailableStream
            java.util.stream.Stream r1 = r1.stream()
            r0.<init>(r1)
            return r0
    }

    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> stream(java.util.stream.Stream<T> r1) {
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = new org.apache.commons.lang3.stream.Streams$FailableStream
            r0.<init>(r1)
            return r0
    }

    public static <T, U, E extends java.lang.Throwable> boolean test(org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> r1, T r2, U r3) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda7
            r0.<init>(r1, r2, r3)
            boolean r1 = getAsBoolean(r0)
            return r1
    }

    public static <T, E extends java.lang.Throwable> boolean test(org.apache.commons.lang3.function.FailablePredicate<T, E> r1, T r2) {
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            boolean r1 = getAsBoolean(r0)
            return r1
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.function.FailableRunnable<? extends java.lang.Throwable> r3, org.apache.commons.lang3.function.FailableConsumer<java.lang.Throwable, ? extends java.lang.Throwable> r4, org.apache.commons.lang3.function.FailableRunnable<? extends java.lang.Throwable>... r5) {
            if (r4 != 0) goto L7
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda4 r4 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda4
            r4.<init>()
        L7:
            java.util.stream.Stream r0 = org.apache.commons.lang3.stream.Streams.of(r5)
            org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda5 r1 = new org.apache.commons.lang3.function.Failable$$ExternalSyntheticLambda5
            r1.<init>()
            r0.forEach(r1)
            r3.run()     // Catch: java.lang.Throwable -> L18
            r3 = 0
            goto L19
        L18:
            r3 = move-exception
        L19:
            if (r5 == 0) goto L2c
            int r0 = r5.length
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2c
            r2 = r5[r1]
            r2.run()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            if (r3 != 0) goto L29
            r3 = r2
        L29:
            int r1 = r1 + 1
            goto L1d
        L2c:
            if (r3 == 0) goto L38
            r4.accept(r3)     // Catch: java.lang.Throwable -> L32
            goto L38
        L32:
            r3 = move-exception
            java.lang.RuntimeException r3 = rethrow(r3)
            throw r3
        L38:
            return
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.function.FailableRunnable<? extends java.lang.Throwable> r1, org.apache.commons.lang3.function.FailableRunnable<? extends java.lang.Throwable>... r2) {
            r0 = 0
            tryWithResources(r1, r0, r2)
            return
    }
}
