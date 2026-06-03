package org.apache.commons.lang3.stream;

/* JADX INFO: loaded from: classes2.dex */
public class Streams {

    public static class ArrayCollector<E> implements java.util.stream.Collector<E, java.util.List<E>, E[]> {
        private static final java.util.Set<java.util.stream.Collector.Characteristics> characteristics = null;
        private final java.lang.Class<E> elementType;

        public static /* synthetic */ java.util.ArrayList $r8$lambda$aw4WkQINtNlXlsGxYEbzatsgkDc() {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
        }

        static {
                java.util.Set r0 = java.util.Collections.emptySet()
                org.apache.commons.lang3.stream.Streams.ArrayCollector.characteristics = r0
                return
        }

        public ArrayCollector(java.lang.Class<E> r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "elementType"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.Class r2 = (java.lang.Class) r2
                r1.elementType = r2
                return
        }

        static /* synthetic */ java.util.List lambda$combiner$0(java.util.List r0, java.util.List r1) {
                r0.addAll(r1)
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.BiConsumer<java.util.List<E>, E> accumulator() {
                r1 = this;
                org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2
                r0.<init>()
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
                r1 = this;
                java.util.Set<java.util.stream.Collector$Characteristics> r0 = org.apache.commons.lang3.stream.Streams.ArrayCollector.characteristics
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.BinaryOperator<java.util.List<E>> combiner() {
                r1 = this;
                org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda2
                r0.<init>()
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.Function<java.util.List<E>, E[]> finisher() {
                r1 = this;
                org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda1
                r0.<init>(r1)
                return r0
        }

        /* JADX INFO: renamed from: lambda$finisher$1$org-apache-commons-lang3-stream-Streams$ArrayCollector, reason: not valid java name */
        /* synthetic */ java.lang.Object[] m2673x3e66eb69(java.util.List r3) {
                r2 = this;
                java.lang.Class<E> r0 = r2.elementType
                int r1 = r3.size()
                java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.newInstance(r0, r1)
                java.lang.Object[] r3 = r3.toArray(r0)
                return r3
        }

        @Override // java.util.stream.Collector
        public java.util.function.Supplier<java.util.List<E>> supplier() {
                r1 = this;
                org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda0
                r0.<init>()
                return r0
        }
    }

    private static final class EnumerationSpliterator<T> extends java.util.Spliterators.AbstractSpliterator<T> {
        private final java.util.Enumeration<T> enumeration;

        protected EnumerationSpliterator(long r1, int r3, java.util.Enumeration<T> r4) {
                r0 = this;
                r0.<init>(r1, r3)
                java.lang.String r1 = "enumeration"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r4, r1)
                java.util.Enumeration r1 = (java.util.Enumeration) r1
                r0.enumeration = r1
                return
        }

        private boolean next(java.util.function.Consumer<? super T> r2) {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.enumeration
                java.lang.Object r0 = r0.nextElement()
                r2.accept(r0)
                r2 = 1
                return r2
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(java.util.function.Consumer<? super T> r2) {
                r1 = this;
            L0:
                java.util.Enumeration<T> r0 = r1.enumeration
                boolean r0 = r0.hasMoreElements()
                if (r0 == 0) goto Lc
                r1.next(r2)
                goto L0
            Lc:
                return
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(java.util.function.Consumer<? super T> r2) {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.enumeration
                boolean r0 = r0.hasMoreElements()
                if (r0 == 0) goto L10
                boolean r2 = r1.next(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    public static class FailableStream<T> {
        private java.util.stream.Stream<T> stream;
        private boolean terminated;

        public FailableStream(java.util.stream.Stream<T> r1) {
                r0 = this;
                r0.<init>()
                r0.stream = r1
                return
        }

        public boolean allMatch(org.apache.commons.lang3.function.FailablePredicate<T, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Predicate r2 = org.apache.commons.lang3.function.Failable.asPredicate(r2)
                boolean r2 = r0.allMatch(r2)
                return r2
        }

        public boolean anyMatch(org.apache.commons.lang3.function.FailablePredicate<T, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Predicate r2 = org.apache.commons.lang3.function.Failable.asPredicate(r2)
                boolean r2 = r0.anyMatch(r2)
                return r2
        }

        protected void assertNotTerminated() {
                r2 = this;
                boolean r0 = r2.terminated
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This stream is already terminated."
                r0.<init>(r1)
                throw r0
        }

        public <A, R> R collect(java.util.function.Supplier<R> r2, java.util.function.BiConsumer<R, ? super T> r3, java.util.function.BiConsumer<R, R> r4) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.collect(r2, r3, r4)
                return r2
        }

        public <A, R> R collect(java.util.stream.Collector<? super T, A, R> r2) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.collect(r2)
                return r2
        }

        public org.apache.commons.lang3.stream.Streams.FailableStream<T> filter(org.apache.commons.lang3.function.FailablePredicate<T, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream<T> r0 = r1.stream
                java.util.function.Predicate r2 = org.apache.commons.lang3.function.Failable.asPredicate(r2)
                java.util.stream.Stream r2 = r0.filter(r2)
                r1.stream = r2
                return r1
        }

        public void forEach(org.apache.commons.lang3.function.FailableConsumer<T, ?> r2) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Consumer r2 = org.apache.commons.lang3.function.Failable.asConsumer(r2)
                r0.forEach(r2)
                return
        }

        protected void makeTerminated() {
                r1 = this;
                r1.assertNotTerminated()
                r0 = 1
                r1.terminated = r0
                return
        }

        public <R> org.apache.commons.lang3.stream.Streams.FailableStream<R> map(org.apache.commons.lang3.function.FailableFunction<T, R, ?> r3) {
                r2 = this;
                r2.assertNotTerminated()
                org.apache.commons.lang3.stream.Streams$FailableStream r0 = new org.apache.commons.lang3.stream.Streams$FailableStream
                java.util.stream.Stream<T> r1 = r2.stream
                java.util.function.Function r3 = org.apache.commons.lang3.function.Failable.asFunction(r3)
                java.util.stream.Stream r3 = r1.map(r3)
                r0.<init>(r3)
                return r0
        }

        public T reduce(T r2, java.util.function.BinaryOperator<T> r3) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.reduce(r2, r3)
                return r2
        }

        public java.util.stream.Stream<T> stream() {
                r1 = this;
                java.util.stream.Stream<T> r0 = r1.stream
                return r0
        }
    }

    public static /* synthetic */ boolean $r8$lambda$KY9hGHiD4ckKGC9B8u4NKQDrdAo(java.lang.Class r0, java.lang.Object r1) {
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$e0qfpZXSjs7T3eqaqVSaHkij-aw, reason: not valid java name */
    public static /* synthetic */ boolean m2672$r8$lambda$e0qfpZXSjs7T3eqaqVSaHkijaw(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    @java.lang.Deprecated
    public Streams() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> failableStream(T r0) {
            java.util.stream.Stream r0 = streamOf(r0)
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = failableStream(r0)
            return r0
    }

    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> failableStream(java.util.Collection<T> r0) {
            java.util.stream.Stream r0 = of(r0)
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = failableStream(r0)
            return r0
    }

    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> failableStream(java.util.stream.Stream<T> r1) {
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = new org.apache.commons.lang3.stream.Streams$FailableStream
            r0.<init>(r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> failableStream(T... r0) {
            java.util.stream.Stream r0 = of(r0)
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = failableStream(r0)
            return r0
    }

    public static <E> java.util.stream.Stream<E> instancesOf(java.lang.Class<? super E> r0, java.util.Collection<? super E> r1) {
            java.util.stream.Stream r1 = of(r1)
            java.util.stream.Stream r0 = instancesOf(r0, r1)
            return r0
    }

    private static <E> java.util.stream.Stream<E> instancesOf(java.lang.Class<? super E> r1, java.util.stream.Stream<?> r2) {
            java.util.stream.Stream r2 = of(r2)
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda1
            r0.<init>(r1)
            java.util.stream.Stream r1 = r2.filter(r0)
            return r1
    }

    public static <E> java.util.stream.Stream<E> nonNull(E r0) {
            java.util.stream.Stream r0 = streamOf(r0)
            java.util.stream.Stream r0 = nonNull(r0)
            return r0
    }

    public static <E> java.util.stream.Stream<E> nonNull(java.util.Collection<E> r1) {
            java.util.stream.Stream r1 = of(r1)
            org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.filter(r0)
            return r1
    }

    public static <E> java.util.stream.Stream<E> nonNull(java.util.stream.Stream<E> r1) {
            java.util.stream.Stream r1 = of(r1)
            org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.filter(r0)
            return r1
    }

    @java.lang.SafeVarargs
    public static <E> java.util.stream.Stream<E> nonNull(E... r0) {
            java.util.stream.Stream r0 = of(r0)
            java.util.stream.Stream r0 = nonNull(r0)
            return r0
    }

    public static <E> java.util.stream.Stream<E> of(java.lang.Iterable<E> r1) {
            if (r1 != 0) goto L7
            java.util.stream.Stream r1 = java.util.stream.Stream.empty()
            goto L10
        L7:
            java.util.Spliterator r1 = r1.spliterator()
            r0 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r0)
        L10:
            return r1
    }

    public static <E> java.util.stream.Stream<E> of(java.util.Collection<E> r0) {
            if (r0 != 0) goto L7
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
            goto Lb
        L7:
            java.util.stream.Stream r0 = r0.stream()
        Lb:
            return r0
    }

    public static <E> java.util.stream.Stream<E> of(java.util.Enumeration<E> r4) {
            org.apache.commons.lang3.stream.Streams$EnumerationSpliterator r0 = new org.apache.commons.lang3.stream.Streams$EnumerationSpliterator
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 16
            r0.<init>(r1, r3, r4)
            r4 = 0
            java.util.stream.Stream r4 = java.util.stream.StreamSupport.stream(r0, r4)
            return r4
    }

    public static <E> java.util.stream.Stream<E> of(java.util.Iterator<E> r1) {
            if (r1 != 0) goto L7
            java.util.stream.Stream r1 = java.util.stream.Stream.empty()
            goto L12
        L7:
            r0 = 16
            java.util.Spliterator r1 = java.util.Spliterators.spliteratorUnknownSize(r1, r0)
            r0 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r0)
        L12:
            return r1
    }

    private static <E> java.util.stream.Stream<E> of(java.util.stream.Stream<E> r0) {
            if (r0 != 0) goto L6
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
        L6:
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> java.util.stream.Stream<T> of(T... r0) {
            if (r0 != 0) goto L7
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
            goto Lb
        L7:
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
        Lb:
            return r0
    }

    @java.lang.Deprecated
    public static <E> org.apache.commons.lang3.stream.Streams.FailableStream<E> stream(java.util.Collection<E> r0) {
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = failableStream(r0)
            return r0
    }

    @java.lang.Deprecated
    public static <T> org.apache.commons.lang3.stream.Streams.FailableStream<T> stream(java.util.stream.Stream<T> r0) {
            org.apache.commons.lang3.stream.Streams$FailableStream r0 = failableStream(r0)
            return r0
    }

    private static <T> java.util.stream.Stream<T> streamOf(T r0) {
            if (r0 != 0) goto L7
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
            goto Lb
        L7:
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
        Lb:
            return r0
    }

    public static <T> java.util.stream.Collector<T, ?, T[]> toArray(java.lang.Class<T> r1) {
            org.apache.commons.lang3.stream.Streams$ArrayCollector r0 = new org.apache.commons.lang3.stream.Streams$ArrayCollector
            r0.<init>(r1)
            return r0
    }
}
