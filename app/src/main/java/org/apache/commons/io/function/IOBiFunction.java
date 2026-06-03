package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOBiFunction<T, U, R> {
    static /* synthetic */ java.lang.Object lambda$andThen$0(org.apache.commons.io.function.IOBiFunction r0, org.apache.commons.io.function.IOFunction r1, java.lang.Object r2, java.lang.Object r3) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2, r3)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$asBiFunction$1(org.apache.commons.io.function.IOBiFunction r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            return r1
    }

    default <V> org.apache.commons.io.function.IOBiFunction<T, U, V> andThen(org.apache.commons.io.function.IOFunction<? super R, ? extends V> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOBiFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOBiFunction$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1, U r2) throws java.io.IOException;

    default java.util.function.BiFunction<T, U, R> asBiFunction() {
            r1 = this;
            org.apache.commons.io.function.IOBiFunction$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOBiFunction$$ExternalSyntheticLambda1
            r0.<init>(r1)
            return r0
    }
}
