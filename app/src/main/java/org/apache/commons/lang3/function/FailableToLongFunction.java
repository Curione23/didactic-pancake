package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableToLongFunction<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableToLongFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableToLongFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableToLongFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableToLongFunction.NOP = r0
            return
    }

    static /* synthetic */ long lambda$static$0(java.lang.Object r2) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableToLongFunction<T, E> nop() {
            org.apache.commons.lang3.function.FailableToLongFunction r0 = org.apache.commons.lang3.function.FailableToLongFunction.NOP
            return r0
    }

    long applyAsLong(T r1) throws java.lang.Throwable;
}
