package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoubleToLongFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableDoubleToLongFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableDoubleToLongFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableDoubleToLongFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoubleToLongFunction.NOP = r0
            return
    }

    static /* synthetic */ int lambda$static$0(double r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoubleToLongFunction<E> nop() {
            org.apache.commons.lang3.function.FailableDoubleToLongFunction r0 = org.apache.commons.lang3.function.FailableDoubleToLongFunction.NOP
            return r0
    }

    int applyAsLong(double r1) throws java.lang.Throwable;
}
