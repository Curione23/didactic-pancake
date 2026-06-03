package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntConsumer<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$andThen$1(org.apache.commons.lang3.function.FailableIntConsumer r0, org.apache.commons.lang3.function.FailableIntConsumer r1, int r2) throws java.lang.Throwable {
            r0.accept(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ void lambda$static$0(int r0) throws java.lang.Throwable {
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntConsumer<E> nop() {
            org.apache.commons.lang3.function.FailableIntConsumer r0 = org.apache.commons.lang3.function.FailableIntConsumer.NOP
            return r0
    }

    void accept(int r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableIntConsumer<E> andThen(org.apache.commons.lang3.function.FailableIntConsumer<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }
}
