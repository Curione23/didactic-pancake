package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOQuadFunction<T, U, V, W, R> {
    static /* synthetic */ java.lang.Object lambda$andThen$0(org.apache.commons.io.function.IOQuadFunction r0, org.apache.commons.io.function.IOFunction r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2, r3, r4, r5)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    default <X> org.apache.commons.io.function.IOQuadFunction<T, U, V, W, X> andThen(org.apache.commons.io.function.IOFunction<? super R, ? extends X> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOQuadFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOQuadFunction$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1, U r2, V r3, W r4) throws java.io.IOException;
}
