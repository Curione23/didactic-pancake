package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
public class Consumers {
    private static final java.util.function.Consumer NOP = null;

    static {
            java.util.function.Function r0 = java.util.function.Function.identity()
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.lang3.function.Consumers$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.function.Consumers$$ExternalSyntheticLambda0
            r1.<init>(r0)
            org.apache.commons.lang3.function.Consumers.NOP = r1
            return
    }

    private Consumers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> void accept(java.util.function.Consumer<T> r0, T r1) {
            if (r0 == 0) goto L5
            r0.accept(r1)
        L5:
            return
    }

    public static <T> java.util.function.Consumer<T> nop() {
            java.util.function.Consumer r0 = org.apache.commons.lang3.function.Consumers.NOP
            return r0
    }
}
