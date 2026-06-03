package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface FailableBiPredicate<T, U, E extends java.lang.Throwable> {
    public static final org.apache.commons.lang3.function.FailableBiPredicate FALSE = null;
    public static final org.apache.commons.lang3.function.FailableBiPredicate TRUE = null;

    static {
            org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda3
            r0.<init>()
            org.apache.commons.lang3.function.FailableBiPredicate.FALSE = r0
            org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda4
            r0.<init>()
            org.apache.commons.lang3.function.FailableBiPredicate.TRUE = r0
            return
    }

    static <T, U, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> falsePredicate() {
            org.apache.commons.lang3.function.FailableBiPredicate r0 = org.apache.commons.lang3.function.FailableBiPredicate.FALSE
            return r0
    }

    static /* synthetic */ boolean lambda$and$2(org.apache.commons.lang3.function.FailableBiPredicate r1, org.apache.commons.lang3.function.FailableBiPredicate r2, java.lang.Object r3, java.lang.Object r4) throws java.lang.Throwable {
            boolean r0 = r1.test(r3, r4)
            if (r0 == 0) goto Le
            boolean r2 = r2.test(r3, r4)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    static /* synthetic */ boolean lambda$negate$3(org.apache.commons.lang3.function.FailableBiPredicate r0, java.lang.Object r1, java.lang.Object r2) throws java.lang.Throwable {
            boolean r1 = r0.test(r1, r2)
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ boolean lambda$or$4(org.apache.commons.lang3.function.FailableBiPredicate r1, org.apache.commons.lang3.function.FailableBiPredicate r2, java.lang.Object r3, java.lang.Object r4) throws java.lang.Throwable {
            boolean r0 = r1.test(r3, r4)
            if (r0 != 0) goto Lf
            boolean r2 = r2.test(r3, r4)
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

    static /* synthetic */ boolean lambda$static$0(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean lambda$static$1(java.lang.Object r0, java.lang.Object r1) throws java.lang.Throwable {
            r0 = 1
            return r0
    }

    static <T, U, E extends java.lang.Throwable> org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> truePredicate() {
            org.apache.commons.lang3.function.FailableBiPredicate r0 = org.apache.commons.lang3.function.FailableBiPredicate.TRUE
            return r0
    }

    default org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> and(org.apache.commons.lang3.function.FailableBiPredicate<? super T, ? super U, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> negate() {
            r1 = this;
            org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.lang3.function.FailableBiPredicate<T, U, E> or(org.apache.commons.lang3.function.FailableBiPredicate<? super T, ? super U, E> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(T r1, U r2) throws java.lang.Throwable;
}
