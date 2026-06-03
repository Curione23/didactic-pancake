package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableSupplier<T, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableSupplier NUL = null;

    static {
            org.apache.commons.lang3.function.FailableSupplier$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableSupplier$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableSupplier.NUL = r0
            return
    }

    static /* synthetic */ java.lang.Object lambda$static$0() throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <T, E extends java.lang.Exception> org.apache.commons.lang3.function.FailableSupplier<T, E> nul() {
            org.apache.commons.lang3.function.FailableSupplier r0 = org.apache.commons.lang3.function.FailableSupplier.NUL
            return r0
    }

    T get() throws java.lang.Throwable;
}
