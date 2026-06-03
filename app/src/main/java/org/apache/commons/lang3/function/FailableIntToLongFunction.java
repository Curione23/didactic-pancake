package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntToLongFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntToLongFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableIntToLongFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntToLongFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntToLongFunction.NOP = r0
            return
    }

    static /* synthetic */ long lambda$static$0(int r2) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntToLongFunction<E> nop() {
            org.apache.commons.lang3.function.FailableIntToLongFunction r0 = org.apache.commons.lang3.function.FailableIntToLongFunction.NOP
            return r0
    }

    long applyAsLong(int r1) throws java.lang.Throwable;
}
