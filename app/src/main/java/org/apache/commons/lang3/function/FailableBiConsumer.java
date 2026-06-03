package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableBiConsumer<T, U, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableBiConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableBiConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$andThen$1(org.apache.commons.lang3.function.FailableBiConsumer r0, org.apache.commons.lang3.function.FailableBiConsumer r1, java.lang.Object r2, java.lang.Object r3) throws java.lang.Throwable {
            r0.accept(r2, r3)
            r1.accept(r2, r3)
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            return
    }

    static <T, U, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableBiConsumer<T, U, E> nop() {
            org.apache.commons.lang3.function.FailableBiConsumer r0 = org.apache.commons.lang3.function.FailableBiConsumer.NOP
            return r0
    }

    void accept(T r1, U r2) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableBiConsumer<T, U, E> andThen(org.apache.commons.lang3.function.FailableBiConsumer<? super T, ? super U, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }
}
