package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    static <T> androidx.core.util.Predicate<T> isEqual(java.lang.Object r1) {
            if (r1 != 0) goto L8
            androidx.core.util.Predicate$$ExternalSyntheticLambda1 r1 = new androidx.core.util.Predicate$$ExternalSyntheticLambda1
            r1.<init>()
            goto Le
        L8:
            androidx.core.util.Predicate$$ExternalSyntheticLambda2 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda2
            r0.<init>(r1)
            r1 = r0
        Le:
            return r1
    }

    static /* synthetic */ boolean lambda$and$0(androidx.core.util.Predicate r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
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

    static /* synthetic */ boolean lambda$isEqual$3(java.lang.Object r0) {
            boolean r0 = java.util.Objects.isNull(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$isEqual$4(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$negate$1(androidx.core.util.Predicate r0, java.lang.Object r1) {
            boolean r1 = r0.test(r1)
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ boolean lambda$or$2(androidx.core.util.Predicate r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
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

    static <T> androidx.core.util.Predicate<T> not(androidx.core.util.Predicate<? super T> r0) {
            java.util.Objects.requireNonNull(r0)
            androidx.core.util.Predicate r0 = r0.negate()
            return r0
    }

    default androidx.core.util.Predicate<T> and(androidx.core.util.Predicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.Predicate$$ExternalSyntheticLambda3 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    default androidx.core.util.Predicate<T> negate() {
            r1 = this;
            androidx.core.util.Predicate$$ExternalSyntheticLambda4 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    default androidx.core.util.Predicate<T> or(androidx.core.util.Predicate<? super T> r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.Predicate$$ExternalSyntheticLambda0 r0 = new androidx.core.util.Predicate$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    boolean test(T r1);
}
