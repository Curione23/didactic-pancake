package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoubleFunction<R, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableDoubleFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableDoubleFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableDoubleFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoubleFunction.NOP = r0
            return
    }

    static /* synthetic */ java.lang.Object lambda$static$0(double r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoubleFunction<R, E> nop() {
            org.apache.commons.lang3.function.FailableDoubleFunction r0 = org.apache.commons.lang3.function.FailableDoubleFunction.NOP
            return r0
    }

    R apply(double r1) throws java.lang.Throwable;
}
