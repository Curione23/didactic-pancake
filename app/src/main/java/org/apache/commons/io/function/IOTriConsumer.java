package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOTriConsumer<T, U, V> {
    static /* synthetic */ void lambda$andThen$0(org.apache.commons.io.function.IOTriConsumer r0, org.apache.commons.io.function.IOTriConsumer r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) throws java.io.IOException {
            r0.accept(r2, r3, r4)
            r1.accept(r2, r3, r4)
            return
    }

    static <T, U, V> org.apache.commons.io.function.IOTriConsumer<T, U, V> noop() {
            org.apache.commons.io.function.IOTriConsumer r0 = org.apache.commons.io.function.Constants.IO_TRI_CONSUMER
            return r0
    }

    void accept(T r1, U r2, V r3) throws java.io.IOException;

    default org.apache.commons.io.function.IOTriConsumer<T, U, V> andThen(org.apache.commons.io.function.IOTriConsumer<? super T, ? super U, ? super V> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOTriConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOTriConsumer$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }
}
