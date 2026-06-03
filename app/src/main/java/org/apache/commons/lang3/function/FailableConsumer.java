package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableConsumer<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableConsumer NOP = null;

    static {
            java.util.function.Function r0 = java.util.function.Function.identity()
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda0
            r1.<init>(r0)
            org.apache.commons.lang3.function.FailableConsumer.NOP = r1
            return
    }

    static /* synthetic */ void lambda$andThen$0(org.apache.commons.lang3.function.FailableConsumer r0, org.apache.commons.lang3.function.FailableConsumer r1, java.lang.Object r2) throws java.lang.Throwable {
            r0.accept(r2)
            r1.accept(r2)
            return
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableConsumer<T, E> nop() {
            org.apache.commons.lang3.function.FailableConsumer r0 = org.apache.commons.lang3.function.FailableConsumer.NOP
            return r0
    }

    void accept(T r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableConsumer<T, E> andThen(org.apache.commons.lang3.function.FailableConsumer<? super T, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }
}
