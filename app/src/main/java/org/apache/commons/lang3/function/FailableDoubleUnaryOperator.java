package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public interface FailableDoubleUnaryOperator<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableDoubleUnaryOperator NOP = null;

    static {
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator.NOP = r0
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> identity() {
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda0
            r0.<init>()
            return r0
    }

    static /* synthetic */ double lambda$andThen$2(org.apache.commons.lang3.function.FailableDoubleUnaryOperator r0, org.apache.commons.lang3.function.FailableDoubleUnaryOperator r1, double r2) throws java.lang.Throwable {
            double r2 = r0.applyAsDouble(r2)
            double r1 = r1.applyAsDouble(r2)
            return r1
    }

    static /* synthetic */ double lambda$compose$3(org.apache.commons.lang3.function.FailableDoubleUnaryOperator r0, org.apache.commons.lang3.function.FailableDoubleUnaryOperator r1, double r2) throws java.lang.Throwable {
            double r1 = r1.applyAsDouble(r2)
            double r1 = r0.applyAsDouble(r1)
            return r1
    }

    static /* synthetic */ double lambda$identity$1(double r0) throws java.lang.Throwable {
            return r0
    }

    static /* synthetic */ double lambda$static$0(double r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> nop() {
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator r0 = org.apache.commons.lang3.function.FailableDoubleUnaryOperator.NOP
            return r0
    }

    default org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> andThen(org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    double applyAsDouble(double r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> compose(org.apache.commons.lang3.function.FailableDoubleUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }
}
