package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntToDoubleFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntToDoubleFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableIntToDoubleFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntToDoubleFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntToDoubleFunction.NOP = r0
            return
    }

    static /* synthetic */ double lambda$static$0(int r2) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntToDoubleFunction<E> nop() {
            org.apache.commons.lang3.function.FailableIntToDoubleFunction r0 = org.apache.commons.lang3.function.FailableIntToDoubleFunction.NOP
            return r0
    }

    double applyAsDouble(int r1) throws java.lang.Throwable;
}
