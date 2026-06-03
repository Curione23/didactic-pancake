package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableLongConsumer<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableLongConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableLongConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$andThen$1(org.apache.commons.lang3.function.FailableLongConsumer r0, org.apache.commons.lang3.function.FailableLongConsumer r1, long r2) throws java.lang.Throwable {
            r0.accept(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ void lambda$static$0(long r0) throws java.lang.Throwable {
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongConsumer<E> nop() {
            org.apache.commons.lang3.function.FailableLongConsumer r0 = org.apache.commons.lang3.function.FailableLongConsumer.NOP
            return r0
    }

    void accept(long r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableLongConsumer<E> andThen(org.apache.commons.lang3.function.FailableLongConsumer<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }
}
