package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableObjLongConsumer<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableObjLongConsumer NOP = null;

    static {
            org.apache.commons.lang3.function.FailableObjLongConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableObjLongConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableObjLongConsumer.NOP = r0
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r0, long r1) throws java.lang.Throwable {
            return
    }

    static <T, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableObjLongConsumer<T, E> nop() {
            org.apache.commons.lang3.function.FailableObjLongConsumer r0 = org.apache.commons.lang3.function.FailableObjLongConsumer.NOP
            return r0
    }

    void accept(T r1, long r2) throws java.lang.Throwable;
}
