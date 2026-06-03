package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntFunction<R, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableIntFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntFunction.NOP = r0
            return
    }

    static /* synthetic */ java.lang.Object lambda$static$0(int r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <R, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntFunction<R, E> nop() {
            org.apache.commons.lang3.function.FailableIntFunction r0 = org.apache.commons.lang3.function.FailableIntFunction.NOP
            return r0
    }

    R apply(int r1) throws java.lang.Throwable;
}
