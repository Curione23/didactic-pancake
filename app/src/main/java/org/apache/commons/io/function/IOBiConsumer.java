package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOBiConsumer<T, U> {
    static /* synthetic */ void lambda$andThen$0(org.apache.commons.io.function.IOBiConsumer r0, org.apache.commons.io.function.IOBiConsumer r1, java.lang.Object r2, java.lang.Object r3) throws java.io.IOException {
            r0.accept(r2, r3)
            r1.accept(r2, r3)
            return
    }

    static /* synthetic */ void lambda$asBiConsumer$1(org.apache.commons.io.function.IOBiConsumer r0, java.lang.Object r1, java.lang.Object r2) {
            org.apache.commons.io.function.Uncheck.accept(r0, r1, r2)
            return
    }

    static <T, U> org.apache.commons.io.function.IOBiConsumer<T, U> noop() {
            org.apache.commons.io.function.IOBiConsumer r0 = org.apache.commons.io.function.Constants.IO_BI_CONSUMER
            return r0
    }

    void accept(T r1, U r2) throws java.io.IOException;

    default org.apache.commons.io.function.IOBiConsumer<T, U> andThen(org.apache.commons.io.function.IOBiConsumer<? super T, ? super U> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOBiConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOBiConsumer$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    default java.util.function.BiConsumer<T, U> asBiConsumer() {
            r1 = this;
            org.apache.commons.io.function.IOBiConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOBiConsumer$$ExternalSyntheticLambda1
            r0.<init>(r1)
            return r0
    }
}
