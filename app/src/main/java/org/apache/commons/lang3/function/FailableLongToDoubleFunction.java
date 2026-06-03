package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongToDoubleFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableLongToDoubleFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableLongToDoubleFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableLongToDoubleFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableLongToDoubleFunction.NOP = r0
            return
    }

    static /* synthetic */ double lambda$static$0(long r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongToDoubleFunction<E> nop() {
            org.apache.commons.lang3.function.FailableLongToDoubleFunction r0 = org.apache.commons.lang3.function.FailableLongToDoubleFunction.NOP
            return r0
    }

    double applyAsDouble(long r1) throws java.lang.Throwable;
}
