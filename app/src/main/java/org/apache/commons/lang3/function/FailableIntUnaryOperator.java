package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public interface FailableIntUnaryOperator<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntUnaryOperator NOP = null;

    static {
            org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntUnaryOperator.NOP = r0
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntUnaryOperator<E> identity() {
            org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda3
            r0.<init>()
            return r0
    }

    static /* synthetic */ int lambda$andThen$2(org.apache.commons.lang3.function.FailableIntUnaryOperator r0, org.apache.commons.lang3.function.FailableIntUnaryOperator r1, int r2) throws java.lang.Throwable {
            int r2 = r0.applyAsInt(r2)
            int r1 = r1.applyAsInt(r2)
            return r1
    }

    static /* synthetic */ int lambda$compose$3(org.apache.commons.lang3.function.FailableIntUnaryOperator r0, org.apache.commons.lang3.function.FailableIntUnaryOperator r1, int r2) throws java.lang.Throwable {
            int r1 = r1.applyAsInt(r2)
            int r1 = r0.applyAsInt(r1)
            return r1
    }

    static /* synthetic */ int lambda$identity$1(int r0) throws java.lang.Throwable {
            return r0
    }

    static /* synthetic */ int lambda$static$0(int r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntUnaryOperator<E> nop() {
            org.apache.commons.lang3.function.FailableIntUnaryOperator r0 = org.apache.commons.lang3.function.FailableIntUnaryOperator.NOP
            return r0
    }

    default org.apache.commons.lang3.function.FailableIntUnaryOperator<E> andThen(org.apache.commons.lang3.function.FailableIntUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    int applyAsInt(int r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableIntUnaryOperator<E> compose(org.apache.commons.lang3.function.FailableIntUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }
}
