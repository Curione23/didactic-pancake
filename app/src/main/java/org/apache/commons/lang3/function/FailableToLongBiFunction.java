package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableToLongBiFunction<T, U, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableToLongBiFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableToLongBiFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableToLongBiFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableToLongBiFunction.NOP = r0
            return
    }

    static /* synthetic */ long lambda$static$0(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, U, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableToLongBiFunction<T, U, E> nop() {
            org.apache.commons.lang3.function.FailableToLongBiFunction r0 = org.apache.commons.lang3.function.FailableToLongBiFunction.NOP
            return r0
    }

    long applyAsLong(T r1, U r2) throws java.lang.Throwable;
}
