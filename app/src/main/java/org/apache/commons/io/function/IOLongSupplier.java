package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOLongSupplier {
    static /* synthetic */ long lambda$asSupplier$0(org.apache.commons.io.function.IOLongSupplier r2) {
            long r0 = org.apache.commons.io.function.Uncheck.getAsLong(r2)
            return r0
    }

    default java.util.function.LongSupplier asSupplier() {
            r1 = this;
            org.apache.commons.io.function.IOLongSupplier$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOLongSupplier$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    long getAsLong() throws java.io.IOException;
}
