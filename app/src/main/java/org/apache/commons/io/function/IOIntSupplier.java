package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOIntSupplier {
    static /* synthetic */ int lambda$asIntSupplier$0(org.apache.commons.io.function.IOIntSupplier r1) {
            int r0 = org.apache.commons.io.function.Uncheck.getAsInt(r1)
            return r0
    }

    default java.util.function.IntSupplier asIntSupplier() {
            r1 = this;
            org.apache.commons.io.function.IOIntSupplier$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOIntSupplier$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    int getAsInt() throws java.io.IOException;
}
