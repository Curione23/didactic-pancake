package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class Range<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.Comparator<T> comparator;
    private transient int hashCode;
    private final T maximum;
    private final T minimum;
    private transient java.lang.String toString;

    private enum ComparableComparator extends java.lang.Enum<org.apache.commons.lang3.Range.ComparableComparator> implements java.util.Comparator {
        private static final /* synthetic */ org.apache.commons.lang3.Range.ComparableComparator[] $VALUES = null;
        public static final org.apache.commons.lang3.Range.ComparableComparator INSTANCE = null;

        private static /* synthetic */ org.apache.commons.lang3.Range.ComparableComparator[] $values() {
                org.apache.commons.lang3.Range$ComparableComparator r0 = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = new org.apache.commons.lang3.Range.ComparableComparator[]{r0}
                return r0
        }

        static {
                org.apache.commons.lang3.Range$ComparableComparator r0 = new org.apache.commons.lang3.Range$ComparableComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.Range.ComparableComparator.INSTANCE = r0
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = $values()
                org.apache.commons.lang3.Range.ComparableComparator.$VALUES = r0
                return
        }

        ComparableComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.Range.ComparableComparator valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.Range$ComparableComparator> r0 = org.apache.commons.lang3.Range.ComparableComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.Range$ComparableComparator r1 = (org.apache.commons.lang3.Range.ComparableComparator) r1
                return r1
        }

        public static org.apache.commons.lang3.Range.ComparableComparator[] values() {
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = org.apache.commons.lang3.Range.ComparableComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.Range$ComparableComparator[] r0 = (org.apache.commons.lang3.Range.ComparableComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    Range(T r2, T r3, java.util.Comparator<T> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "element1"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "element2"
            java.util.Objects.requireNonNull(r3, r0)
            if (r4 != 0) goto L14
            org.apache.commons.lang3.Range$ComparableComparator r4 = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE
            r1.comparator = r4
            goto L16
        L14:
            r1.comparator = r4
        L16:
            java.util.Comparator<T> r4 = r1.comparator
            int r4 = r4.compare(r2, r3)
            r0 = 1
            if (r4 >= r0) goto L24
            r1.minimum = r2
            r1.maximum = r3
            goto L28
        L24:
            r1.minimum = r3
            r1.maximum = r2
        L28:
            return
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    @java.lang.Deprecated
    public static org.apache.commons.lang3.Range between(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = 0
            org.apache.commons.lang3.Range r1 = of(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static <T> org.apache.commons.lang3.Range<T> between(T r1, T r2, java.util.Comparator<T> r3) {
            org.apache.commons.lang3.Range r0 = new org.apache.commons.lang3.Range
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static org.apache.commons.lang3.Range is(java.lang.Comparable r1) {
            r0 = 0
            org.apache.commons.lang3.Range r1 = of(r1, r1, r0)
            return r1
    }

    public static <T> org.apache.commons.lang3.Range<T> is(T r0, java.util.Comparator<T> r1) {
            org.apache.commons.lang3.Range r0 = of(r0, r0, r1)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static org.apache.commons.lang3.Range of(java.lang.Comparable r1, java.lang.Comparable r2) {
            r0 = 0
            org.apache.commons.lang3.Range r1 = of(r1, r2, r0)
            return r1
    }

    public static <T> org.apache.commons.lang3.Range<T> of(T r1, T r2, java.util.Comparator<T> r3) {
            org.apache.commons.lang3.Range r0 = new org.apache.commons.lang3.Range
            r0.<init>(r1, r2, r3)
            return r0
    }

    public boolean contains(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.minimum
            int r1 = r1.compare(r4, r2)
            r2 = -1
            if (r1 <= r2) goto L1b
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.maximum
            int r4 = r1.compare(r4, r2)
            r1 = 1
            if (r4 >= r1) goto L1b
            r0 = r1
        L1b:
            return r0
    }

    public boolean containsRange(org.apache.commons.lang3.Range<T> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            T r1 = r3.minimum
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L15
            T r3 = r3.maximum
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L15
            r0 = 1
        L15:
            return r0
    }

    public int elementCompareTo(T r2) {
            r1 = this;
            java.lang.String r0 = "element"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r1.isAfter(r2)
            if (r0 == 0) goto Ld
            r2 = -1
            return r2
        Ld:
            boolean r2 = r1.isBefore(r2)
            if (r2 == 0) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r4.getClass()
            if (r2 == r3) goto L12
            goto L2b
        L12:
            org.apache.commons.lang3.Range r5 = (org.apache.commons.lang3.Range) r5
            T r2 = r4.minimum
            T r3 = r5.minimum
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            T r2 = r4.maximum
            T r5 = r5.maximum
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            return r0
        L2b:
            return r1
    }

    public T fit(T r2) {
            r1 = this;
            java.lang.String r0 = "element"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r1.isAfter(r2)
            if (r0 == 0) goto Le
            T r2 = r1.minimum
            return r2
        Le:
            boolean r0 = r1.isBefore(r2)
            if (r0 == 0) goto L16
            T r2 = r1.maximum
        L16:
            return r2
    }

    public java.util.Comparator<T> getComparator() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.comparator
            return r0
    }

    public T getMaximum() {
            r1 = this;
            T r0 = r1.maximum
            return r0
    }

    public T getMinimum() {
            r1 = this;
            T r0 = r1.minimum
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L23
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            r1 = 629(0x275, float:8.81E-43)
            int r1 = r1 + r0
            int r1 = r1 * 37
            T r0 = r2.minimum
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 37
            T r0 = r2.maximum
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            r2.hashCode = r0
        L23:
            return r0
    }

    public org.apache.commons.lang3.Range<T> intersectionWith(org.apache.commons.lang3.Range<T> r5) {
            r4 = this;
            boolean r0 = r4.isOverlappedBy(r5)
            if (r0 == 0) goto L3c
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto Ld
            return r4
        Ld:
            java.util.Comparator r0 = r4.getComparator()
            T r1 = r4.minimum
            T r2 = r5.minimum
            int r0 = r0.compare(r1, r2)
            if (r0 >= 0) goto L1e
            T r0 = r5.minimum
            goto L20
        L1e:
            T r0 = r4.minimum
        L20:
            java.util.Comparator r1 = r4.getComparator()
            T r2 = r4.maximum
            T r3 = r5.maximum
            int r1 = r1.compare(r2, r3)
            if (r1 >= 0) goto L31
            T r5 = r4.maximum
            goto L33
        L31:
            T r5 = r5.maximum
        L33:
            java.util.Comparator r1 = r4.getComparator()
            org.apache.commons.lang3.Range r5 = of(r0, r5, r1)
            return r5
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot calculate intersection with non-overlapping range %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = java.lang.String.format(r1, r5)
            r0.<init>(r5)
            throw r0
    }

    public boolean isAfter(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.minimum
            int r4 = r1.compare(r4, r2)
            if (r4 >= 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isAfterRange(org.apache.commons.lang3.Range<T> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            T r1 = r1.maximum
            boolean r1 = r0.isAfter(r1)
            return r1
    }

    public boolean isBefore(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.maximum
            int r4 = r1.compare(r4, r2)
            if (r4 <= 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isBeforeRange(org.apache.commons.lang3.Range<T> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            T r1 = r1.minimum
            boolean r1 = r0.isBefore(r1)
            return r1
    }

    public boolean isEndedBy(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.maximum
            int r4 = r1.compare(r4, r2)
            if (r4 != 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public boolean isNaturalOrdering() {
            r2 = this;
            java.util.Comparator<T> r0 = r2.comparator
            org.apache.commons.lang3.Range$ComparableComparator r1 = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isOverlappedBy(org.apache.commons.lang3.Range<T> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            T r1 = r2.minimum
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1c
            T r1 = r2.maximum
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1c
            T r3 = r3.minimum
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            return r0
    }

    public boolean isStartedBy(T r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Comparator<T> r1 = r3.comparator
            T r2 = r3.minimum
            int r4 = r1.compare(r4, r2)
            if (r4 != 0) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toString
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            T r1 = r2.minimum
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".."
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r2.maximum
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.toString = r0
        L29:
            java.lang.String r0 = r2.toString
            return r0
    }

    public java.lang.String toString(java.lang.String r4) {
            r3 = this;
            T r0 = r3.minimum
            T r1 = r3.maximum
            java.util.Comparator<T> r2 = r3.comparator
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r4 = java.lang.String.format(r4, r0)
            return r4
    }
}
