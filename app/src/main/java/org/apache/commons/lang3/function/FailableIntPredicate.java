package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableIntPredicate<E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableIntPredicate FALSE = null;
    public static final org.apache.commons.lang3.function.FailableIntPredicate TRUE = null;

    static {
            org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntPredicate.FALSE = r0
            org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda2
            r0.<init>()
            org.apache.commons.lang3.function.FailableIntPredicate.TRUE = r0
            return
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntPredicate<E> falsePredicate() {
            org.apache.commons.lang3.function.FailableIntPredicate r0 = org.apache.commons.lang3.function.FailableIntPredicate.FALSE
            return r0
    }

    static /* synthetic */ boolean lambda$and$2(org.apache.commons.lang3.function.FailableIntPredicate r1, org.apache.commons.lang3.function.FailableIntPredicate r2, int r3) throws java.lang.Throwable {
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

    static /* synthetic */ boolean lambda$negate$3(org.apache.commons.lang3.function.FailableIntPredicate r0, int r1) throws java.lang.Throwable {
            boolean r1 = r0.test(r1)
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ boolean lambda$or$4(org.apache.commons.lang3.function.FailableIntPredicate r1, org.apache.commons.lang3.function.FailableIntPredicate r2, int r3) throws java.lang.Throwable {
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

    static /* synthetic */ boolean lambda$static$0(int r0) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean lambda$static$1(int r0) throws java.lang.Throwable {
            r0 = 1
            return r0
    }

    static <E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableIntPredicate<E> truePredicate() {
            org.apache.commons.lang3.function.FailableIntPredicate r0 = org.apache.commons.lang3.function.FailableIntPredicate.TRUE
            return r0
    }

    default org.apache.commons.lang3.function.FailableIntPredicate<E> and(org.apache.commons.lang3.function.FailableIntPredicate<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.lang3.function.FailableIntPredicate<E> negate() {
            r1 = this;
            org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.lang3.function.FailableIntPredicate<E> or(org.apache.commons.lang3.function.FailableIntPredicate<E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(int r1) throws java.lang.Throwable;
}
