package org.apache.commons.lang3.function;

/* JADX INFO: loaded from: classes2.dex */
public final class Functions {
    private Functions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, R> R apply(java.util.function.Function<T, R> r0, T r1) {
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.apply(r1)
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static <T, R> java.util.function.Function<T, R> function(java.util.function.Function<T, R> r0) {
            return r0
    }
}
