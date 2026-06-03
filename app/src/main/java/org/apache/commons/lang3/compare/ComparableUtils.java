package org.apache.commons.lang3.compare;

/* JADX INFO: loaded from: classes2.dex */
public class ComparableUtils {

    /* JADX INFO: renamed from: org.apache.commons.lang3.compare.ComparableUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class ComparableCheckBuilder<A extends java.lang.Comparable<A>> {
        private final A a;

        private ComparableCheckBuilder(A r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ ComparableCheckBuilder(java.lang.Comparable r1, org.apache.commons.lang3.compare.ComparableUtils.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private boolean betweenOrdered(A r1, A r2) {
                r0 = this;
                boolean r1 = r0.greaterThanOrEqualTo(r1)
                if (r1 == 0) goto Le
                boolean r1 = r0.lessThanOrEqualTo(r2)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        private boolean betweenOrderedExclusive(A r1, A r2) {
                r0 = this;
                boolean r1 = r0.greaterThan(r1)
                if (r1 == 0) goto Le
                boolean r1 = r0.lessThan(r2)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        public boolean between(A r2, A r3) {
                r1 = this;
                boolean r0 = r1.betweenOrdered(r2, r3)
                if (r0 != 0) goto Lf
                boolean r2 = r1.betweenOrdered(r3, r2)
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

        public boolean betweenExclusive(A r2, A r3) {
                r1 = this;
                boolean r0 = r1.betweenOrderedExclusive(r2, r3)
                if (r0 != 0) goto Lf
                boolean r2 = r1.betweenOrderedExclusive(r3, r2)
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

        public boolean equalTo(A r2) {
                r1 = this;
                A extends java.lang.Comparable<A> r0 = r1.a
                int r2 = r0.compareTo(r2)
                if (r2 != 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        public boolean greaterThan(A r2) {
                r1 = this;
                A extends java.lang.Comparable<A> r0 = r1.a
                int r2 = r0.compareTo(r2)
                if (r2 <= 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        public boolean greaterThanOrEqualTo(A r2) {
                r1 = this;
                A extends java.lang.Comparable<A> r0 = r1.a
                int r2 = r0.compareTo(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        public boolean lessThan(A r2) {
                r1 = this;
                A extends java.lang.Comparable<A> r0 = r1.a
                int r2 = r0.compareTo(r2)
                if (r2 >= 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        public boolean lessThanOrEqualTo(A r2) {
                r1 = this;
                A extends java.lang.Comparable<A> r0 = r1.a
                int r2 = r0.compareTo(r2)
                if (r2 > 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    private ComparableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> between(A r1, A r2) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> betweenExclusive(A r1, A r2) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> ge(A r1) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> gt(A r1) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda1
            r0.<init>(r1)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> org.apache.commons.lang3.compare.ComparableUtils.ComparableCheckBuilder<A> is(A r2) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r0 = new org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$between$0(java.lang.Comparable r0, java.lang.Comparable r1, java.lang.Comparable r2) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r2 = is(r2)
            boolean r0 = r2.between(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$betweenExclusive$1(java.lang.Comparable r0, java.lang.Comparable r1, java.lang.Comparable r2) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r2 = is(r2)
            boolean r0 = r2.betweenExclusive(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$ge$2(java.lang.Comparable r0, java.lang.Comparable r1) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r1 = is(r1)
            boolean r0 = r1.greaterThanOrEqualTo(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$gt$3(java.lang.Comparable r0, java.lang.Comparable r1) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r1 = is(r1)
            boolean r0 = r1.greaterThan(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$le$4(java.lang.Comparable r0, java.lang.Comparable r1) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r1 = is(r1)
            boolean r0 = r1.lessThanOrEqualTo(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$lt$5(java.lang.Comparable r0, java.lang.Comparable r1) {
            org.apache.commons.lang3.compare.ComparableUtils$ComparableCheckBuilder r1 = is(r1)
            boolean r0 = r1.lessThan(r0)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> le(A r1) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda5
            r0.<init>(r1)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> java.util.function.Predicate<A> lt(A r1) {
            org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.compare.ComparableUtils$$ExternalSyntheticLambda4
            r0.<init>(r1)
            return r0
    }

    public static <A extends java.lang.Comparable<A>> A max(A r1, A r2) {
            r0 = 0
            int r0 = org.apache.commons.lang3.ObjectUtils.compare(r1, r2, r0)
            if (r0 <= 0) goto L8
            goto L9
        L8:
            r1 = r2
        L9:
            return r1
    }

    public static <A extends java.lang.Comparable<A>> A min(A r1, A r2) {
            r0 = 1
            int r0 = org.apache.commons.lang3.ObjectUtils.compare(r1, r2, r0)
            if (r0 >= 0) goto L8
            goto L9
        L8:
            r1 = r2
        L9:
            return r1
    }
}
