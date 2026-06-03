package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableToIntFunction<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableToIntFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableToIntFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableToIntFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableToIntFunction.NOP = r0
            return
    }

    static /* synthetic */ int lambda$static$0(java.lang.Object r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableToIntFunction<T, E> nop() {
            org.apache.commons.lang3.function.FailableToIntFunction r0 = org.apache.commons.lang3.function.FailableToIntFunction.NOP
            return r0
    }

    int applyAsInt(T r1) throws java.lang.Throwable;
}
