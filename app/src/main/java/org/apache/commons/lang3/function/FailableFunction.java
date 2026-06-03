package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableFunction<T, R, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.lang3.function.FailableFunction.NOP = r0
            return
    }

    static <T, R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableFunction<T, R, E> function(org.apache.commons.lang3.function.FailableFunction<T, R, E> r0) {
            return r0
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableFunction<T, T, E> identity() {
            org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda3
            r0.<init>()
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$andThen$2(org.apache.commons.lang3.function.FailableFunction r0, org.apache.commons.lang3.function.FailableFunction r1, java.lang.Object r2) throws java.lang.Throwable {
            java.lang.Object r2 = r0.apply(r2)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$compose$3(org.apache.commons.lang3.function.FailableFunction r0, org.apache.commons.lang3.function.FailableFunction r1, java.lang.Object r2) throws java.lang.Throwable {
            java.lang.Object r1 = r1.apply(r2)
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$identity$1(java.lang.Object r0) throws java.lang.Throwable {
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$static$0(java.lang.Object r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableFunction<T, R, E> nop() {
            org.apache.commons.lang3.function.FailableFunction r0 = org.apache.commons.lang3.function.FailableFunction.NOP
            return r0
    }

    default <V> org.apache.commons.lang3.function.FailableFunction<T, V, E> andThen(org.apache.commons.lang3.function.FailableFunction<? super R, ? extends V, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1) throws java.lang.Throwable;

    default <V> org.apache.commons.lang3.function.FailableFunction<V, R, E> compose(org.apache.commons.lang3.function.FailableFunction<? super V, ? extends T, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }
}
