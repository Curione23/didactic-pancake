package org.apache.commons.io.function;

import java.util.stream.BaseStream;
import org.apache.commons.io.function.IOBaseStream;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedIOBaseStream<T, S extends org.apache.commons.io.function.IOBaseStream<T, S, B>, B extends java.util.stream.BaseStream<T, B>> implements java.util.stream.BaseStream<T, B> {
    private final S delegate;

    UncheckedIOBaseStream(S r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    static /* synthetic */ void lambda$onClose$0(java.lang.Runnable r0) throws java.io.IOException {
            r0.run()
            return
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            r0.close()
            return
    }

    @Override // java.util.stream.BaseStream
    public boolean isParallel() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            boolean r0 = r0.isParallel()
            return r0
    }

    @Override // java.util.stream.BaseStream
    public java.util.Iterator<T> iterator() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            org.apache.commons.io.function.IOIterator r0 = r0.iterator()
            java.util.Iterator r0 = r0.asIterator()
            return r0
    }

    @Override // java.util.stream.BaseStream
    public B onClose(java.lang.Runnable r3) {
            r2 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r2.delegate
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.function.UncheckedIOBaseStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.function.UncheckedIOBaseStream$$ExternalSyntheticLambda0
            r1.<init>(r0)
            org.apache.commons.io.function.UncheckedIOBaseStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.UncheckedIOBaseStream$$ExternalSyntheticLambda1
            r0.<init>(r3)
            java.lang.Object r3 = org.apache.commons.io.function.Uncheck.apply(r1, r0)
            org.apache.commons.io.function.IOBaseStream r3 = (org.apache.commons.io.function.IOBaseStream) r3
            java.util.stream.BaseStream r3 = r3.unwrap()
            return r3
    }

    @Override // java.util.stream.BaseStream
    public B parallel() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            org.apache.commons.io.function.IOBaseStream r0 = r0.parallel()
            java.util.stream.BaseStream r0 = r0.unwrap()
            return r0
    }

    @Override // java.util.stream.BaseStream
    public B sequential() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            org.apache.commons.io.function.IOBaseStream r0 = r0.sequential()
            java.util.stream.BaseStream r0 = r0.unwrap()
            return r0
    }

    @Override // java.util.stream.BaseStream
    public java.util.Spliterator<T> spliterator() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            org.apache.commons.io.function.IOSpliterator r0 = r0.spliterator()
            java.util.Spliterator r0 = r0.unwrap()
            return r0
    }

    @Override // java.util.stream.BaseStream
    public B unordered() {
            r1 = this;
            S extends org.apache.commons.io.function.IOBaseStream<T, S, B> r0 = r1.delegate
            org.apache.commons.io.function.IOBaseStream r0 = r0.unordered()
            java.util.stream.BaseStream r0 = r0.unwrap()
            return r0
    }
}
