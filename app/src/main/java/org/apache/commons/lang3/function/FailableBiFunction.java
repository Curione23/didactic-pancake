package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableBiFunction<T, U, R, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableBiFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableBiFunction.NOP = r0
            return
    }

    static /* synthetic */ java.lang.Object lambda$andThen$1(org.apache.commons.lang3.function.FailableBiFunction r0, org.apache.commons.lang3.function.FailableFunction r1, java.lang.Object r2, java.lang.Object r3) throws java.lang.Throwable {
            java.lang.Object r2 = r0.apply(r2, r3)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$static$0(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, U, R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableBiFunction<T, U, R, E> nop() {
            org.apache.commons.lang3.function.FailableBiFunction r0 = org.apache.commons.lang3.function.FailableBiFunction.NOP
            return r0
    }

    default <V> org.apache.commons.lang3.function.FailableBiFunction<T, U, V, E> andThen(org.apache.commons.lang3.function.FailableFunction<? super R, ? extends V, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1, U r2) throws java.lang.Throwable;
}
