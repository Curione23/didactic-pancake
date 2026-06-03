package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
final class IOSpliteratorAdapter<T> implements org.apache.commons.io.function.IOSpliterator<T> {
    private final java.util.Spliterator<T> delegate;

    IOSpliteratorAdapter(java.util.Spliterator<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.Spliterator r2 = (java.util.Spliterator) r2
            r1.delegate = r2
            return
    }

    static <E> org.apache.commons.io.function.IOSpliteratorAdapter<E> adapt(java.util.Spliterator<E> r1) {
            org.apache.commons.io.function.IOSpliteratorAdapter r0 = new org.apache.commons.io.function.IOSpliteratorAdapter
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.function.IOSpliterator
    public java.util.Spliterator<T> unwrap() {
            r1 = this;
            java.util.Spliterator<T> r0 = r1.delegate
            return r0
    }
}
