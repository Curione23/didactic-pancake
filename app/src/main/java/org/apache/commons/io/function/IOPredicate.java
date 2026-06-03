package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOPredicate<T> {
    static /* synthetic */ boolean $r8$lambda$gx1Jdaj42S0FDU1vfr5mAh7UFy4(java.lang.Object r0) {
            boolean r0 = java.util.Objects.isNull(r0)
            return r0
    }

    static <T> org.apache.commons.io.function.IOPredicate<T> alwaysFalse() {
            org.apache.commons.io.function.IOPredicate<java.lang.Object> r0 = org.apache.commons.io.function.Constants.IO_PREDICATE_FALSE
            return r0
    }

    static <T> org.apache.commons.io.function.IOPredicate<T> alwaysTrue() {
            org.apache.commons.io.function.IOPredicate<java.lang.Object> r0 = org.apache.commons.io.function.Constants.IO_PREDICATE_TRUE
            return r0
    }

    static <T> org.apache.commons.io.function.IOPredicate<T> isEqual(java.lang.Object r1) {
            if (r1 != 0) goto L8
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda1
            r1.<init>()
            goto Le
        L8:
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda2
            r0.<init>(r1)
            r1 = r0
        Le:
            return r1
    }

    static /* synthetic */ boolean lambda$and$1(org.apache.commons.io.function.IOPredicate r1, org.apache.commons.io.function.IOPredicate r2, java.lang.Object r3) throws java.io.IOException {
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

    static /* synthetic */ boolean lambda$asPredicate$2(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) {
            boolean r1 = org.apache.commons.io.function.Uncheck.test(r0, r1)
            return r1
    }

    static /* synthetic */ boolean lambda$isEqual$0(java.lang.Object r0, java.lang.Object r1) throws java.io.IOException {
            boolean r0 = r0.equals(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$negate$3(org.apache.commons.io.function.IOPredicate r0, java.lang.Object r1) throws java.io.IOException {
            boolean r1 = r0.test(r1)
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ boolean lambda$or$4(org.apache.commons.io.function.IOPredicate r1, org.apache.commons.io.function.IOPredicate r2, java.lang.Object r3) throws java.io.IOException {
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

    default org.apache.commons.io.function.IOPredicate<T> and(org.apache.commons.io.function.IOPredicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda4
            r0.<init>(r1, r2)
            return r0
    }

    default java.util.function.Predicate<T> asPredicate() {
            r1 = this;
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda5
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.io.function.IOPredicate<T> negate() {
            r1 = this;
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.io.function.IOPredicate<T> or(org.apache.commons.io.function.IOPredicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.function.IOPredicate$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(T r1) throws java.io.IOException;
}
