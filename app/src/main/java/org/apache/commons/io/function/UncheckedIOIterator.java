package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedIOIterator<E> implements java.util.Iterator<E> {
    private final org.apache.commons.io.function.IOIterator<E> delegate;

    UncheckedIOIterator(org.apache.commons.io.function.IOIterator<E> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOIterator r2 = (org.apache.commons.io.function.IOIterator) r2
            r1.delegate = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            org.apache.commons.io.function.IOIterator<E> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda2
            r1.<init>(r0)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r2 = this;
            org.apache.commons.io.function.IOIterator<E> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r1)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            org.apache.commons.io.function.IOIterator<E> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.function.UncheckedIOIterator$$ExternalSyntheticLambda1
            r1.<init>(r0)
            org.apache.commons.io.function.Uncheck.run(r1)
            return
    }
}
