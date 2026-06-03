package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableObjDoubleConsumer<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableObjDoubleConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableObjDoubleConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableObjDoubleConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableObjDoubleConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r0, double r1) throws java.lang.Throwable {
            return
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableObjDoubleConsumer<T, E> nop() {
            org.apache.commons.lang3.function.FailableObjDoubleConsumer r0 = org.apache.commons.lang3.function.FailableObjDoubleConsumer.NOP
            return r0
    }

    void accept(T r1, double r2) throws java.lang.Throwable;
}
