package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongToIntFunction<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableLongToIntFunction NOP = null;

    static {
            org.apache.commons.lang3.function.FailableLongToIntFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableLongToIntFunction$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableLongToIntFunction.NOP = r0
            return
    }

    static /* synthetic */ int lambda$static$0(long r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongToIntFunction<E> nop() {
            org.apache.commons.lang3.function.FailableLongToIntFunction r0 = org.apache.commons.lang3.function.FailableLongToIntFunction.NOP
            return r0
    }

    int applyAsInt(long r1) throws java.lang.Throwable;
}
