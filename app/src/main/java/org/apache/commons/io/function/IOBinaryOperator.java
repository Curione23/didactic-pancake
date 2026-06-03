package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOBinaryOperator<T> extends org.apache.commons.io.function.IOBiFunction<T, T, T> {
    static /* synthetic */ java.lang.Object lambda$asBinaryOperator$2(org.apache.commons.io.function.IOBinaryOperator r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$maxBy$0(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
            int r0 = r0.compare(r1, r2)
            if (r0 < 0) goto L7
            goto L8
        L7:
            r1 = r2
        L8:
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$minBy$1(org.apache.commons.io.function.IOComparator r0, java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
            int r0 = r0.compare(r1, r2)
            if (r0 > 0) goto L7
            goto L8
        L7:
            r1 = r2
        L8:
            return r1
    }

    static <T> org.apache.commons.io.function.IOBinaryOperator<T> maxBy(org.apache.commons.io.function.IOComparator<? super T> r1) {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda1
            r0.<init>(r1)
            return r0
    }

    static <T> org.apache.commons.io.function.IOBinaryOperator<T> minBy(org.apache.commons.io.function.IOComparator<? super T> r1) {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda2
            r0.<init>(r1)
            return r0
    }

    default java.util.function.BinaryOperator<T> asBinaryOperator() {
            r1 = this;
            org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOBinaryOperator$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }
}
