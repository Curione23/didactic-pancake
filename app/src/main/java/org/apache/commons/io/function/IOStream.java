package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
public interface IOStream<T> extends org.apache.commons.io.function.IOBaseStream<T, org.apache.commons.io.function.IOStream<T>, java.util.stream.Stream<T>> {


    static <T> org.apache.commons.io.function.IOStream<T> adapt(java.util.stream.Stream<T> r0) {
            org.apache.commons.io.function.IOStream r0 = org.apache.commons.io.function.IOStreamAdapter.adapt(r0)
            return r0
    }

    static <T> org.apache.commons.io.function.IOStream<T> empty() {
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
            org.apache.commons.io.function.IOStream r0 = org.apache.commons.io.function.IOStreamAdapter.adapt(r0)
            return r0
    }

    static <T> org.apache.commons.io.function.IOStream<T> iterate(T r1, org.apache.commons.io.function.IOUnaryOperator<T> r2) {
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOStream$1 r0 = new org.apache.commons.io.function.IOStream$1
            r0.<init>(r1, r2)
            r1 = 1040(0x410, float:1.457E-42)
            java.util.Spliterator r1 = java.util.Spliterators.spliteratorUnknownSize(r0, r1)
            r2 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r2)
            org.apache.commons.io.function.IOStream r1 = adapt(r1)
            return r1
    }

    static /* synthetic */ boolean lambda$allMatch$0(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) {
            boolean r0 = org.apache.commons.io.function.Erase.test(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$anyMatch$1(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) {
            boolean r0 = org.apache.commons.io.function.Erase.test(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$collect$2(org.apache.commons.io.function.IOSupplier r0) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.get(r0)
            return r0
    }

    static /* synthetic */ void lambda$collect$3(org.apache.commons.io.function.IOBiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
            org.apache.commons.io.function.Erase.accept(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$collect$4(org.apache.commons.io.function.IOBiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
            org.apache.commons.io.function.Erase.accept(r0, r1, r2)
            return
    }

    static /* synthetic */ boolean lambda$filter$5(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) {
            boolean r0 = org.apache.commons.io.function.Erase.test(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.stream.Stream lambda$flatMap$6(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1)
            org.apache.commons.io.function.IOStream r0 = (org.apache.commons.io.function.IOStream) r0
            java.util.stream.BaseStream r0 = r0.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            return r0
    }

    static /* synthetic */ java.util.stream.DoubleStream lambda$flatMapToDouble$7(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1)
            java.util.stream.DoubleStream r0 = (java.util.stream.DoubleStream) r0
            return r0
    }

    static /* synthetic */ java.util.stream.IntStream lambda$flatMapToInt$8(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1)
            java.util.stream.IntStream r0 = (java.util.stream.IntStream) r0
            return r0
    }

    static /* synthetic */ java.util.stream.LongStream lambda$flatMapToLong$9(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1)
            java.util.stream.LongStream r0 = (java.util.stream.LongStream) r0
            return r0
    }

    static /* synthetic */ java.io.IOException lambda$forAll$10(java.lang.Integer r0, java.io.IOException r1) {
            return r1
    }

    static /* synthetic */ void lambda$forAll$11(org.apache.commons.io.function.IOConsumer r0, java.util.concurrent.atomic.AtomicReference r1, java.util.function.BiFunction r2, java.util.concurrent.atomic.AtomicInteger r3, java.lang.Object r4) {
            r0.accept(r4)     // Catch: java.io.IOException -> L4
            goto L2c
        L4:
            r0 = move-exception
            java.lang.Object r4 = r1.get()
            if (r4 != 0) goto L13
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.set(r4)
        L13:
            if (r2 == 0) goto L2c
            java.lang.Object r1 = r1.get()
            java.util.List r1 = (java.util.List) r1
            int r4 = r3.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r2.apply(r4, r0)
            java.io.IOException r0 = (java.io.IOException) r0
            r1.add(r0)
        L2c:
            r3.incrementAndGet()
            return
    }

    static /* synthetic */ void lambda$forEach$12(org.apache.commons.io.function.IOConsumer r0, java.lang.Object r1) {
            org.apache.commons.io.function.Erase.accept(r0, r1)
            return
    }

    static /* synthetic */ void lambda$forEachOrdered$13(org.apache.commons.io.function.IOConsumer r0, java.lang.Object r1) {
            org.apache.commons.io.function.Erase.accept(r0, r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$map$14(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1)
            return r0
    }

    static /* synthetic */ int lambda$max$15(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = org.apache.commons.io.function.Erase.compare(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int lambda$min$16(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = org.apache.commons.io.function.Erase.compare(r0, r1, r2)
            return r0
    }

    static /* synthetic */ boolean lambda$noneMatch$17(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) {
            boolean r0 = org.apache.commons.io.function.Erase.test(r0, r1)
            return r0
    }

    static /* synthetic */ void lambda$peek$18(org.apache.commons.io.function.IOConsumer r0, java.lang.Object r1) {
            org.apache.commons.io.function.Erase.accept(r0, r1)
            return
    }

    static /* synthetic */ java.lang.Object lambda$reduce$19(org.apache.commons.io.function.IOBinaryOperator r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$reduce$20(org.apache.commons.io.function.IOBinaryOperator r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$reduce$21(org.apache.commons.io.function.IOBiFunction r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$reduce$22(org.apache.commons.io.function.IOBinaryOperator r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = org.apache.commons.io.function.Erase.apply(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int lambda$sorted$23(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = org.apache.commons.io.function.Erase.compare(r0, r1, r2)
            return r0
    }

    static <T> org.apache.commons.io.function.IOStream<T> of(java.lang.Iterable<T> r1) {
            if (r1 != 0) goto L7
            org.apache.commons.io.function.IOStream r1 = empty()
            goto L14
        L7:
            java.util.Spliterator r1 = r1.spliterator()
            r0 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r0)
            org.apache.commons.io.function.IOStream r1 = adapt(r1)
        L14:
            return r1
    }

    static <T> org.apache.commons.io.function.IOStream<T> of(T r0) {
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.io.function.IOStream r0 = adapt(r0)
            return r0
    }

    @java.lang.SafeVarargs
    static <T> org.apache.commons.io.function.IOStream<T> of(T... r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.stream.Stream r1 = java.util.Arrays.stream(r1)
            org.apache.commons.io.function.IOStream r1 = adapt(r1)
            goto L13
        Lf:
            org.apache.commons.io.function.IOStream r1 = empty()
        L13:
            return r1
    }

    default boolean allMatch(org.apache.commons.io.function.IOPredicate<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda10 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda10
            r1.<init>(r3)
            boolean r3 = r0.allMatch(r1)
            return r3
    }

    default boolean anyMatch(org.apache.commons.io.function.IOPredicate<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda9 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda9
            r1.<init>(r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    default <R, A> R collect(java.util.stream.Collector<? super T, A, R> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.lang.Object r2 = r0.collect(r2)
            return r2
    }

    default <R> R collect(org.apache.commons.io.function.IOSupplier<R> r3, org.apache.commons.io.function.IOBiConsumer<R, ? super T> r4, org.apache.commons.io.function.IOBiConsumer<R, R> r5) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda22 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda22
            r1.<init>(r3)
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda23 r3 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda23
            r3.<init>(r4)
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda1 r4 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda1
            r4.<init>(r5)
            java.lang.Object r3 = r0.collect(r1, r3, r4)
            return r3
    }

    default long count() {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            long r0 = r0.count()
            return r0
    }

    default org.apache.commons.io.function.IOStream<T> distinct() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.Stream r0 = r0.distinct()
            org.apache.commons.io.function.IOStream r0 = adapt(r0)
            return r0
    }

    default org.apache.commons.io.function.IOStream<T> filter(org.apache.commons.io.function.IOPredicate<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda6 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda6
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.filter(r1)
            org.apache.commons.io.function.IOStream r3 = adapt(r3)
            return r3
    }

    default java.util.Optional<T> findAny() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.Optional r0 = r0.findAny()
            return r0
    }

    default java.util.Optional<T> findFirst() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.Optional r0 = r0.findFirst()
            return r0
    }

    default <R> org.apache.commons.io.function.IOStream<R> flatMap(org.apache.commons.io.function.IOFunction<? super T, ? extends org.apache.commons.io.function.IOStream<? extends R>> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda3 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda3
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.flatMap(r1)
            org.apache.commons.io.function.IOStream r3 = adapt(r3)
            return r3
    }

    default java.util.stream.DoubleStream flatMapToDouble(org.apache.commons.io.function.IOFunction<? super T, ? extends java.util.stream.DoubleStream> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda14 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda14
            r1.<init>(r3)
            java.util.stream.DoubleStream r3 = r0.flatMapToDouble(r1)
            return r3
    }

    default java.util.stream.IntStream flatMapToInt(org.apache.commons.io.function.IOFunction<? super T, ? extends java.util.stream.IntStream> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda11 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda11
            r1.<init>(r3)
            java.util.stream.IntStream r3 = r0.flatMapToInt(r1)
            return r3
    }

    default java.util.stream.LongStream flatMapToLong(org.apache.commons.io.function.IOFunction<? super T, ? extends java.util.stream.LongStream> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda12 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda12
            r1.<init>(r3)
            java.util.stream.LongStream r3 = r0.flatMapToLong(r1)
            return r3
    }

    default void forAll(org.apache.commons.io.function.IOConsumer<T> r2) throws org.apache.commons.io.IOExceptionList {
            r1 = this;
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda5
            r0.<init>()
            r1.forAll(r2, r0)
            return
    }

    default void forAll(org.apache.commons.io.function.IOConsumer<T> r5, java.util.function.BiFunction<java.lang.Integer, java.io.IOException, java.io.IOException> r6) throws org.apache.commons.io.IOExceptionList {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            org.apache.commons.io.function.IOConsumer r5 = org.apache.commons.io.function.IOStreams.toIOConsumer(r5)
            java.util.stream.BaseStream r2 = r4.unwrap()
            java.util.stream.Stream r2 = (java.util.stream.Stream) r2
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda18 r3 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda18
            r3.<init>(r5, r0, r6, r1)
            r2.forEach(r3)
            java.lang.Object r5 = r0.get()
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            org.apache.commons.io.IOExceptionList.checkEmpty(r5, r6)
            return
    }

    default void forEach(org.apache.commons.io.function.IOConsumer<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda17 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda17
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    default void forEachOrdered(org.apache.commons.io.function.IOConsumer<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda19 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda19
            r1.<init>(r3)
            r0.forEachOrdered(r1)
            return
    }

    default org.apache.commons.io.function.IOStream<T> limit(long r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.Stream r2 = r0.limit(r2)
            org.apache.commons.io.function.IOStream r2 = adapt(r2)
            return r2
    }

    default <R> org.apache.commons.io.function.IOStream<R> map(org.apache.commons.io.function.IOFunction<? super T, ? extends R> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda2
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.map(r1)
            org.apache.commons.io.function.IOStream r3 = adapt(r3)
            return r3
    }

    default java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.DoubleStream r2 = r0.mapToDouble(r2)
            return r2
    }

    default java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction<? super T> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.IntStream r2 = r0.mapToInt(r2)
            return r2
    }

    default java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction<? super T> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.LongStream r2 = r0.mapToLong(r2)
            return r2
    }

    default java.util.Optional<T> max(org.apache.commons.io.function.IOComparator<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda21 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda21
            r1.<init>(r3)
            java.util.Optional r3 = r0.max(r1)
            return r3
    }

    default java.util.Optional<T> min(org.apache.commons.io.function.IOComparator<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda20 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda20
            r1.<init>(r3)
            java.util.Optional r3 = r0.min(r1)
            return r3
    }

    default boolean noneMatch(org.apache.commons.io.function.IOPredicate<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda16 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda16
            r1.<init>(r3)
            boolean r3 = r0.noneMatch(r1)
            return r3
    }

    default org.apache.commons.io.function.IOStream<T> peek(org.apache.commons.io.function.IOConsumer<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda4 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda4
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.peek(r1)
            org.apache.commons.io.function.IOStream r3 = adapt(r3)
            return r3
    }

    default <U> U reduce(U r3, org.apache.commons.io.function.IOBiFunction<U, ? super T, U> r4, org.apache.commons.io.function.IOBinaryOperator<U> r5) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda7 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda7
            r1.<init>(r4)
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda8 r4 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda8
            r4.<init>(r5)
            java.lang.Object r3 = r0.reduce(r3, r1, r4)
            return r3
    }

    default T reduce(T r3, org.apache.commons.io.function.IOBinaryOperator<T> r4) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda13 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda13
            r1.<init>(r4)
            java.lang.Object r3 = r0.reduce(r3, r1)
            return r3
    }

    default java.util.Optional<T> reduce(org.apache.commons.io.function.IOBinaryOperator<T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.util.Optional r3 = r0.reduce(r1)
            return r3
    }

    default org.apache.commons.io.function.IOStream<T> skip(long r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.Stream r2 = r0.skip(r2)
            org.apache.commons.io.function.IOStream r2 = adapt(r2)
            return r2
    }

    default org.apache.commons.io.function.IOStream<T> sorted() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.util.stream.Stream r0 = r0.sorted()
            org.apache.commons.io.function.IOStream r0 = adapt(r0)
            return r0
    }

    default org.apache.commons.io.function.IOStream<T> sorted(org.apache.commons.io.function.IOComparator<? super T> r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda15 r1 = new org.apache.commons.io.function.IOStream$$ExternalSyntheticLambda15
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.sorted(r1)
            org.apache.commons.io.function.IOStream r3 = adapt(r3)
            return r3
    }

    default java.lang.Object[] toArray() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    default <A> A[] toArray(java.util.function.IntFunction<A[]> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
