package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableToDoubleFunction<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableToDoubleFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableToDoubleFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableToDoubleFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableToDoubleFunction.NOP = r0
            return
    }

    static /* synthetic */ double lambda$static$0(java.lang.Object r2) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableToDoubleFunction<T, E> nop() {
            org.apache.commons.lang3.function.FailableToDoubleFunction r0 = org.apache.commons.lang3.function.FailableToDoubleFunction.NOP
            return r0
    }

    double applyAsDouble(T r1) throws java.lang.Throwable;
}
