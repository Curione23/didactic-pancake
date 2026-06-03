package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableDoublePredicate<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableDoublePredicate FALSE = null;
    public static final org.apache.commons.lang3.function.FailableDoublePredicate TRUE = null;

    static {
            org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoublePredicate.FALSE = r0
            org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda4
            r0.<init>()
            org.apache.commons.lang3.function.FailableDoublePredicate.TRUE = r0
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoublePredicate<E> falsePredicate() {
            org.apache.commons.lang3.function.FailableDoublePredicate r0 = org.apache.commons.lang3.function.FailableDoublePredicate.FALSE
            return r0
    }

    static /* synthetic */ boolean lambda$and$2(org.apache.commons.lang3.function.FailableDoublePredicate r1, org.apache.commons.lang3.function.FailableDoublePredicate r2, double r3) throws java.lang.Throwable {
            boolean r0 = r1.test(r3)
            if (r0 == 0) goto Le
            boolean r2 = r2.test(r3)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    static /* synthetic */ boolean lambda$negate$3(org.apache.commons.lang3.function.FailableDoublePredicate r0, double r1) throws java.lang.Throwable {
            boolean r1 = r0.test(r1)
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ boolean lambda$or$4(org.apache.commons.lang3.function.FailableDoublePredicate r1, org.apache.commons.lang3.function.FailableDoublePredicate r2, double r3) throws java.lang.Throwable {
            boolean r0 = r1.test(r3)
            if (r0 != 0) goto Lf
            boolean r2 = r2.test(r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    static /* synthetic */ boolean lambda$static$0(double r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean lambda$static$1(double r0) throws java.lang.Throwable {
            r0 = 1
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableDoublePredicate<E> truePredicate() {
            org.apache.commons.lang3.function.FailableDoublePredicate r0 = org.apache.commons.lang3.function.FailableDoublePredicate.TRUE
            return r0
    }

    default org.apache.commons.lang3.function.FailableDoublePredicate<E> and(org.apache.commons.lang3.function.FailableDoublePredicate<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.lang3.function.FailableDoublePredicate<E> negate() {
            r1 = this;
            org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda2
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.lang3.function.FailableDoublePredicate<E> or(org.apache.commons.lang3.function.FailableDoublePredicate<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(double r1) throws java.lang.Throwable;
}
