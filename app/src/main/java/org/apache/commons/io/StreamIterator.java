package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamIterator<E> implements java.util.Iterator<E>, java.lang.AutoCloseable {
    private boolean closed;
    private final java.util.Iterator<E> iterator;
    private final java.util.stream.Stream<E> stream;

    private StreamIterator(java.util.stream.Stream<E> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "stream"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            java.util.stream.Stream r0 = (java.util.stream.Stream) r0
            r1.stream = r0
            java.util.Iterator r2 = r2.iterator()
            r1.iterator = r2
            return
    }

    public static <T> org.apache.commons.io.StreamIterator<T> iterator(java.util.stream.Stream<T> r1) {
            org.apache.commons.io.StreamIterator r0 = new org.apache.commons.io.StreamIterator
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.closed = r0
            java.util.stream.Stream<E> r0 = r1.stream
            r0.close()
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Iterator<E> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r1.close()
        L11:
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto Lb
            r1.close()
        Lb:
            return r0
    }
}
