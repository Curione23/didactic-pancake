package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOUnaryOperator<T> extends org.apache.commons.io.function.IOFunction<T, T> {
    static <T> org.apache.commons.io.function.IOUnaryOperator<T> identity() {
            org.apache.commons.io.function.IOUnaryOperator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOUnaryOperator$$ExternalSyntheticLambda1
            r0.<init>()
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$asUnaryOperator$1(org.apache.commons.io.function.IOUnaryOperator r0, java.lang.Object r1) {
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$identity$0(java.lang.Object r0) throws java.io.IOException {
            return r0
    }

    default java.util.function.UnaryOperator<T> asUnaryOperator() {
            r1 = this;
            org.apache.commons.io.function.IOUnaryOperator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOUnaryOperator$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }
}
