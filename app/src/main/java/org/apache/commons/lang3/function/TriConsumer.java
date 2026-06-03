package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface TriConsumer<T, U, V> {
    static /* synthetic */ void lambda$andThen$0(org.apache.commons.lang3.function.TriConsumer r0, org.apache.commons.lang3.function.TriConsumer r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r0.accept(r2, r3, r4)
            r1.accept(r2, r3, r4)
            return
    }

    void accept(T r1, U r2, V r3);

    default org.apache.commons.lang3.function.TriConsumer<T, U, V> andThen(org.apache.commons.lang3.function.TriConsumer<? super T, ? super U, ? super V> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.TriConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.TriConsumer$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }
}
