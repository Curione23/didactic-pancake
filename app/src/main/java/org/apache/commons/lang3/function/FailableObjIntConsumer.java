package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableObjIntConsumer<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableObjIntConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableObjIntConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableObjIntConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableObjIntConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r0, int r1) throws java.lang.Throwable {
            return
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableObjIntConsumer<T, E> nop() {
            org.apache.commons.lang3.function.FailableObjIntConsumer r0 = org.apache.commons.lang3.function.FailableObjIntConsumer.NOP
            return r0
    }

    void accept(T r1, int r2) throws java.lang.Throwable;
}
