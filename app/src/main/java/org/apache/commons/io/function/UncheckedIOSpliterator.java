package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedIOSpliterator<T> implements java.util.Spliterator<T> {
    private final org.apache.commons.io.function.IOSpliterator<T> delegate;

    UncheckedIOSpliterator(org.apache.commons.io.function.IOSpliterator<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOSpliterator r2 = (org.apache.commons.io.function.IOSpliterator) r2
            r1.delegate = r2
            return
    }

    @Override // java.util.Spliterator
    public int characteristics() {
            r1 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r1.delegate
            int r0 = r0.characteristics()
            return r0
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
            r2 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r2.delegate
            long r0 = r0.estimateSize()
            return r0
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(java.util.function.Consumer<? super T> r3) {
            r2 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda3 r1 = new org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda3
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda1
            r0.<init>(r3)
            org.apache.commons.io.function.Uncheck.accept(r1, r0)
            return
    }

    @Override // java.util.Spliterator
    public java.util.Comparator<? super T> getComparator() {
            r1 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r1.delegate
            org.apache.commons.io.function.IOComparator r0 = r0.getComparator()
            java.util.Comparator r0 = r0.asComparator()
            return r0
    }

    @Override // java.util.Spliterator
    public long getExactSizeIfKnown() {
            r2 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r2.delegate
            long r0 = r0.getExactSizeIfKnown()
            return r0
    }

    @Override // java.util.Spliterator
    public boolean hasCharacteristics(int r2) {
            r1 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r1.delegate
            boolean r2 = r0.hasCharacteristics(r2)
            return r2
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(java.util.function.Consumer<? super T> r3) {
            r2 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda1
            r0.<init>(r3)
            java.lang.Object r3 = org.apache.commons.io.function.Uncheck.apply(r1, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    @Override // java.util.Spliterator
    public java.util.Spliterator<T> trySplit() {
            r2 = this;
            org.apache.commons.io.function.IOSpliterator<T> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.function.UncheckedIOSpliterator$$ExternalSyntheticLambda2
            r1.<init>(r0)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r1)
            org.apache.commons.io.function.IOSpliterator r0 = (org.apache.commons.io.function.IOSpliterator) r0
            java.util.Spliterator r0 = r0.unwrap()
            return r0
    }
}
