package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableToIntBiFunction<T, U, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableToIntBiFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableToIntBiFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableToIntBiFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableToIntBiFunction.NOP = r0
            return
    }

    static /* synthetic */ int lambda$static$0(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, U, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableToIntBiFunction<T, U, E> nop() {
            org.apache.commons.lang3.function.FailableToIntBiFunction r0 = org.apache.commons.lang3.function.FailableToIntBiFunction.NOP
            return r0
    }

    int applyAsInt(T r1, U r2) throws java.lang.Throwable;
}
