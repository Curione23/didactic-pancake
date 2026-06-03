package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public interface UncheckedFuture<V> extends java.util.concurrent.Future<V> {
    static <T> java.util.stream.Stream<org.apache.commons.lang3.concurrent.UncheckedFuture<T>> map(java.util.Collection<java.util.concurrent.Future<T>> r1) {
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.lang3.concurrent.UncheckedFuture$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.concurrent.UncheckedFuture$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.map(r0)
            return r1
    }

    static <T> java.util.Collection<org.apache.commons.lang3.concurrent.UncheckedFuture<T>> on(java.util.Collection<java.util.concurrent.Future<T>> r1) {
            java.util.stream.Stream r1 = map(r1)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    static <T> org.apache.commons.lang3.concurrent.UncheckedFuture<T> on(java.util.concurrent.Future<T> r1) {
            org.apache.commons.lang3.concurrent.UncheckedFutureImpl r0 = new org.apache.commons.lang3.concurrent.UncheckedFutureImpl
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.concurrent.Future
    V get();

    @Override // java.util.concurrent.Future
    V get(long r1, java.util.concurrent.TimeUnit r3);
}
