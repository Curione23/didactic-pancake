package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class Streams {

    @java.lang.Deprecated
    public static class ArrayCollector<O> implements java.util.stream.Collector<O, java.util.List<O>, O[]> {
        private static final java.util.Set<java.util.stream.Collector.Characteristics> characteristics = null;
        private final java.lang.Class<O> elementType;

        public static /* synthetic */ java.util.ArrayList $r8$lambda$aw4WkQINtNlXlsGxYEbzatsgkDc() {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
        }

        static {
                java.util.Set r0 = java.util.Collections.emptySet()
                org.apache.commons.lang3.Streams.ArrayCollector.characteristics = r0
                return
        }

        public ArrayCollector(java.lang.Class<O> r1) {
                r0 = this;
                r0.<init>()
                r0.elementType = r1
                return
        }

        static /* synthetic */ java.util.List lambda$combiner$0(java.util.List r0, java.util.List r1) {
                r0.addAll(r1)
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.BiConsumer<java.util.List<O>, O> accumulator() {
                r1 = this;
                org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2
                r0.<init>()
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
                r1 = this;
                java.util.Set<java.util.stream.Collector$Characteristics> r0 = org.apache.commons.lang3.Streams.ArrayCollector.characteristics
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.BinaryOperator<java.util.List<O>> combiner() {
                r1 = this;
                org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda1
                r0.<init>()
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.Function<java.util.List<O>, O[]> finisher() {
                r1 = this;
                org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }

        /* JADX INFO: renamed from: lambda$finisher$1$org-apache-commons-lang3-Streams$ArrayCollector, reason: not valid java name */
        /* synthetic */ java.lang.Object[] m2659xfe0fe9ee(java.util.List r3) {
                r2 = this;
                java.lang.Class<O> r0 = r2.elementType
                int r1 = r3.size()
                java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.newInstance(r0, r1)
                java.lang.Object[] r3 = r3.toArray(r0)
                return r3
        }

        @Override // java.util.stream.Collector
        public java.util.function.Supplier<java.util.List<O>> supplier() {
                r1 = this;
                org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda3
                r0.<init>()
                return r0
        }
    }

    @java.lang.Deprecated
    public static class FailableStream<O> {
        private java.util.stream.Stream<O> stream;
        private boolean terminated;

        public FailableStream(java.util.stream.Stream<O> r1) {
                r0 = this;
                r0.<init>()
                r0.stream = r1
                return
        }

        public boolean allMatch(org.apache.commons.lang3.Functions.FailablePredicate<O, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Predicate r2 = org.apache.commons.lang3.Functions.asPredicate(r2)
                boolean r2 = r0.allMatch(r2)
                return r2
        }

        public boolean anyMatch(org.apache.commons.lang3.Functions.FailablePredicate<O, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Predicate r2 = org.apache.commons.lang3.Functions.asPredicate(r2)
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

        public <A, R> R collect(java.util.function.Supplier<R> r2, java.util.function.BiConsumer<R, ? super O> r3, java.util.function.BiConsumer<R, R> r4) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.collect(r2, r3, r4)
                return r2
        }

        public <A, R> R collect(java.util.stream.Collector<? super O, A, R> r2) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.collect(r2)
                return r2
        }

        public org.apache.commons.lang3.Streams.FailableStream<O> filter(org.apache.commons.lang3.Functions.FailablePredicate<O, ?> r2) {
                r1 = this;
                r1.assertNotTerminated()
                java.util.stream.Stream<O> r0 = r1.stream
                java.util.function.Predicate r2 = org.apache.commons.lang3.Functions.asPredicate(r2)
                java.util.stream.Stream r2 = r0.filter(r2)
                r1.stream = r2
                return r1
        }

        public void forEach(org.apache.commons.lang3.Functions.FailableConsumer<O, ?> r2) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.util.function.Consumer r2 = org.apache.commons.lang3.Functions.asConsumer(r2)
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

        public <R> org.apache.commons.lang3.Streams.FailableStream<R> map(org.apache.commons.lang3.Functions.FailableFunction<O, R, ?> r3) {
                r2 = this;
                r2.assertNotTerminated()
                org.apache.commons.lang3.Streams$FailableStream r0 = new org.apache.commons.lang3.Streams$FailableStream
                java.util.stream.Stream<O> r1 = r2.stream
                java.util.function.Function r3 = org.apache.commons.lang3.Functions.asFunction(r3)
                java.util.stream.Stream r3 = r1.map(r3)
                r0.<init>(r3)
                return r0
        }

        public O reduce(O r2, java.util.function.BinaryOperator<O> r3) {
                r1 = this;
                r1.makeTerminated()
                java.util.stream.Stream r0 = r1.stream()
                java.lang.Object r2 = r0.reduce(r2, r3)
                return r2
        }

        public java.util.stream.Stream<O> stream() {
                r1 = this;
                java.util.stream.Stream<O> r0 = r1.stream
                return r0
        }
    }

    public Streams() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <O> org.apache.commons.lang3.Streams.FailableStream<O> stream(java.util.Collection<O> r0) {
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.lang3.Streams$FailableStream r0 = stream(r0)
            return r0
    }

    public static <O> org.apache.commons.lang3.Streams.FailableStream<O> stream(java.util.stream.Stream<O> r1) {
            org.apache.commons.lang3.Streams$FailableStream r0 = new org.apache.commons.lang3.Streams$FailableStream
            r0.<init>(r1)
            return r0
    }

    public static <O> java.util.stream.Collector<O, ?, O[]> toArray(java.lang.Class<O> r1) {
            org.apache.commons.lang3.Streams$ArrayCollector r0 = new org.apache.commons.lang3.Streams$ArrayCollector
            r0.<init>(r1)
            return r0
    }
}
