package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface TriFunction<T, U, V, R> {
    static /* synthetic */ java.lang.Object lambda$andThen$0(org.apache.commons.lang3.function.TriFunction r0, java.util.function.Function r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            java.lang.Object r2 = r0.apply(r2, r3, r4)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    default <W> org.apache.commons.lang3.function.TriFunction<T, U, V, W> andThen(java.util.function.Function<? super R, ? extends W> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.TriFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.TriFunction$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1, U r2, V r3);
}
