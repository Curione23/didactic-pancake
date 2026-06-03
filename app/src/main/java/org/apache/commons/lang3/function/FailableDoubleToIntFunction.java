package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoubleToIntFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableDoubleToIntFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableDoubleToIntFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableDoubleToIntFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoubleToIntFunction.NOP = r0
            return
    }

    static /* synthetic */ int lambda$static$0(double r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoubleToIntFunction<E> nop() {
            org.apache.commons.lang3.function.FailableDoubleToIntFunction r0 = org.apache.commons.lang3.function.FailableDoubleToIntFunction.NOP
            return r0
    }

    int applyAsInt(double r1) throws java.lang.Throwable;
}
