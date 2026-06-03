package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOSupplier<T> {
    static /* synthetic */ java.lang.Object lambda$asSupplier$0(org.apache.commons.io.function.IOSupplier r1) {
            java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r1)
            return r0
    }

    default java.util.function.Supplier<T> asSupplier() {
            r1 = this;
            org.apache.commons.io.function.IOSupplier$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOSupplier$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    T get() throws java.io.IOException;
}
