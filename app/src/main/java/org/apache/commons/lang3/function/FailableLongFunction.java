package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongFunction<R, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableLongFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableLongFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableLongFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableLongFunction.NOP = r0
            return
    }

    static /* synthetic */ java.lang.Object lambda$static$0(long r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongFunction<R, E> nop() {
            org.apache.commons.lang3.function.FailableLongFunction r0 = org.apache.commons.lang3.function.FailableLongFunction.NOP
            return r0
    }

    R apply(long r1) throws java.lang.Throwable;
}
