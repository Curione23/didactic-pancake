package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public interface FailableLongUnaryOperator<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableLongUnaryOperator NOP = null;

    static {
            org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda2
            r0.<init>()
            org.apache.commons.lang3.function.FailableLongUnaryOperator.NOP = r0
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongUnaryOperator<E> identity() {
            org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda0
            r0.<init>()
            return r0
    }

    static /* synthetic */ long lambda$andThen$2(org.apache.commons.lang3.function.FailableLongUnaryOperator r0, org.apache.commons.lang3.function.FailableLongUnaryOperator r1, long r2) throws java.lang.Throwable {
            long r2 = r0.applyAsLong(r2)
            long r1 = r1.applyAsLong(r2)
            return r1
    }

    static /* synthetic */ long lambda$compose$3(org.apache.commons.lang3.function.FailableLongUnaryOperator r0, org.apache.commons.lang3.function.FailableLongUnaryOperator r1, long r2) throws java.lang.Throwable {
            long r1 = r1.applyAsLong(r2)
            long r1 = r0.applyAsLong(r1)
            return r1
    }

    static /* synthetic */ long lambda$identity$1(long r0) throws java.lang.Throwable {
            return r0
    }

    static /* synthetic */ long lambda$static$0(long r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableLongUnaryOperator<E> nop() {
            org.apache.commons.lang3.function.FailableLongUnaryOperator r0 = org.apache.commons.lang3.function.FailableLongUnaryOperator.NOP
            return r0
    }

    default org.apache.commons.lang3.function.FailableLongUnaryOperator<E> andThen(org.apache.commons.lang3.function.FailableLongUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    long applyAsLong(long r1) throws java.lang.Throwable;

    default org.apache.commons.lang3.function.FailableLongUnaryOperator<E> compose(org.apache.commons.lang3.function.FailableLongUnaryOperator<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }
}
