package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
public interface IOSpliterator<T> {
    static <E> org.apache.commons.io.function.IOSpliterator<E> adapt(java.util.Spliterator<E> r0) {
            org.apache.commons.io.function.IOSpliteratorAdapter r0 = org.apache.commons.io.function.IOSpliteratorAdapter.adapt(r0)
            return r0
    }

    default java.util.Spliterator<T> asSpliterator() {
            r1 = this;
            org.apache.commons.io.function.UncheckedIOSpliterator r0 = new org.apache.commons.io.function.UncheckedIOSpliterator
            r0.<init>(r1)
            return r0
    }

    default int characteristics() {
            r1 = this;
            java.util.Spliterator r0 = r1.unwrap()
            int r0 = r0.characteristics()
            return r0
    }

    default long estimateSize() {
            r2 = this;
            java.util.Spliterator r0 = r2.unwrap()
            long r0 = r0.estimateSize()
            return r0
    }

    default void forEachRemaining(org.apache.commons.io.function.IOConsumer<? super T> r2) {
            r1 = this;
        L0:
            boolean r0 = r1.tryAdvance(r2)
            if (r0 == 0) goto L7
            goto L0
        L7:
            return
    }

    default org.apache.commons.io.function.IOComparator<? super T> getComparator() {
            r1 = this;
            java.util.Spliterator r0 = r1.unwrap()
            java.util.Comparator r0 = r0.getComparator()
            org.apache.commons.io.function.IOComparator r0 = (org.apache.commons.io.function.IOComparator) r0
            return r0
    }

    default long getExactSizeIfKnown() {
            r2 = this;
            java.util.Spliterator r0 = r2.unwrap()
            long r0 = r0.getExactSizeIfKnown()
            return r0
    }

    default boolean hasCharacteristics(int r2) {
            r1 = this;
            java.util.Spliterator r0 = r1.unwrap()
            boolean r2 = r0.hasCharacteristics(r2)
            return r2
    }

    default boolean tryAdvance(org.apache.commons.io.function.IOConsumer<? super T> r3) {
            r2 = this;
            java.util.Spliterator r0 = r2.unwrap()
            java.lang.String r1 = "action"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            org.apache.commons.io.function.IOConsumer r3 = (org.apache.commons.io.function.IOConsumer) r3
            java.util.function.Consumer r3 = r3.asConsumer()
            boolean r3 = r0.tryAdvance(r3)
            return r3
    }

    default org.apache.commons.io.function.IOSpliterator<T> trySplit() {
            r1 = this;
            java.util.Spliterator r0 = r1.unwrap()
            java.util.Spliterator r0 = r0.trySplit()
            org.apache.commons.io.function.IOSpliterator r0 = adapt(r0)
            return r0
    }

    java.util.Spliterator<T> unwrap();
}
