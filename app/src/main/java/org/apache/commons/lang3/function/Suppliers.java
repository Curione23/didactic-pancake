package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
public class Suppliers {
    private static java.util.function.Supplier NUL;

    static {
            org.apache.commons.lang3.function.Suppliers$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.Suppliers$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.Suppliers.NUL = r0
            return
    }

    @java.lang.Deprecated
    public Suppliers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T get(java.util.function.Supplier<T> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Object r0 = r0.get()
        L8:
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$static$0() {
            r0 = 0
            return r0
    }

    public static <T> java.util.function.Supplier<T> nul() {
            java.util.function.Supplier r0 = org.apache.commons.lang3.function.Suppliers.NUL
            return r0
    }
}
