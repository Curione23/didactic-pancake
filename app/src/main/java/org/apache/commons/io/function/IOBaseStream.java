package org.apache.commons.io.function;

import java.util.stream.BaseStream;
import org.apache.commons.io.function.IOBaseStream;

/* JADX INFO: loaded from: classes2.dex */
public interface IOBaseStream<T, S extends org.apache.commons.io.function.IOBaseStream<T, S, B>, B extends java.util.stream.BaseStream<T, B>> extends java.io.Closeable {
    static /* synthetic */ void lambda$onClose$0(org.apache.commons.io.function.IORunnable r0) {
            org.apache.commons.io.function.Erase.run(r0)
            return
    }

    default java.util.stream.BaseStream<T, B> asBaseStream() {
            r1 = this;
            org.apache.commons.io.function.UncheckedIOBaseStream r0 = new org.apache.commons.io.function.UncheckedIOBaseStream
            r0.<init>(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            r0.close()
            return
    }

    default boolean isParallel() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            boolean r0 = r0.isParallel()
            return r0
    }

    default org.apache.commons.io.function.IOIterator<T> iterator() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.Iterator r0 = r0.iterator()
            org.apache.commons.io.function.IOIteratorAdapter r0 = org.apache.commons.io.function.IOIteratorAdapter.adapt(r0)
            return r0
    }

    default S onClose(org.apache.commons.io.function.IORunnable r3) throws java.io.IOException {
            r2 = this;
            java.util.stream.BaseStream r0 = r2.unwrap()
            org.apache.commons.io.function.IOBaseStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.function.IOBaseStream$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.util.stream.BaseStream r3 = r0.onClose(r1)
            org.apache.commons.io.function.IOBaseStream r3 = r2.wrap(r3)
            return r3
    }

    default S parallel() {
            r1 = this;
            boolean r0 = r1.isParallel()
            if (r0 == 0) goto L8
            r0 = r1
            goto L14
        L8:
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.BaseStream r0 = r0.parallel()
            org.apache.commons.io.function.IOBaseStream r0 = r1.wrap(r0)
        L14:
            return r0
    }

    default S sequential() {
            r1 = this;
            boolean r0 = r1.isParallel()
            if (r0 == 0) goto L13
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.BaseStream r0 = r0.sequential()
            org.apache.commons.io.function.IOBaseStream r0 = r1.wrap(r0)
            goto L14
        L13:
            r0 = r1
        L14:
            return r0
    }

    default org.apache.commons.io.function.IOSpliterator<T> spliterator() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.Spliterator r0 = r0.spliterator()
            org.apache.commons.io.function.IOSpliteratorAdapter r0 = org.apache.commons.io.function.IOSpliteratorAdapter.adapt(r0)
            return r0
    }

    default S unordered() {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            java.util.stream.BaseStream r0 = r0.unordered()
            org.apache.commons.io.function.IOBaseStream r0 = r1.wrap(r0)
            return r0
    }

    B unwrap();

    S wrap(B r1);
}
