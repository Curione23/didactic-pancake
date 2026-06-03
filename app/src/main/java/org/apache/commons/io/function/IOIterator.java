package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
public interface IOIterator<E> {
    static <E> org.apache.commons.io.function.IOIterator<E> adapt(java.util.Iterator<E> r0) {
            org.apache.commons.io.function.IOIteratorAdapter r0 = org.apache.commons.io.function.IOIteratorAdapter.adapt(r0)
            return r0
    }

    default java.util.Iterator<E> asIterator() {
            r1 = this;
            org.apache.commons.io.function.UncheckedIOIterator r0 = new org.apache.commons.io.function.UncheckedIOIterator
            r0.<init>(r1)
            return r0
    }

    default void forEachRemaining(org.apache.commons.io.function.IOConsumer<? super E> r2) throws java.io.IOException {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
        L3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()
            r2.accept(r0)
            goto L3
        L11:
            return
    }

    boolean hasNext() throws java.io.IOException;

    E next() throws java.io.IOException;

    default void remove() throws java.io.IOException {
            r1 = this;
            java.util.Iterator r0 = r1.unwrap()
            r0.remove()
            return
    }

    java.util.Iterator<E> unwrap();
}
