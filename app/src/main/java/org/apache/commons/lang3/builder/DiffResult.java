package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class DiffResult<T> implements java.lang.Iterable<org.apache.commons.lang3.builder.Diff<?>> {
    public static final java.lang.String OBJECTS_SAME_STRING = "";
    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffList;
    private final T lhs;
    private final T rhs;
    private final org.apache.commons.lang3.builder.ToStringStyle style;
    private final java.lang.String toStringFormat;

    DiffResult(T r2, T r3, java.util.List<org.apache.commons.lang3.builder.Diff<?>> r4, org.apache.commons.lang3.builder.ToStringStyle r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "diffList"
            java.lang.Object r4 = java.util.Objects.requireNonNull(r4, r0)
            java.util.List r4 = (java.util.List) r4
            r1.diffList = r4
            java.lang.String r4 = "lhs"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r4)
            r1.lhs = r2
            java.lang.String r2 = "rhs"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            r1.rhs = r2
            java.lang.String r2 = "style"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r5, r2)
            org.apache.commons.lang3.builder.ToStringStyle r2 = (org.apache.commons.lang3.builder.ToStringStyle) r2
            r1.style = r2
            java.lang.String r2 = "toStringFormat"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r6, r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.toStringFormat = r2
            return
    }

    static /* synthetic */ void lambda$toString$0(org.apache.commons.lang3.builder.ToStringBuilder r2, org.apache.commons.lang3.builder.ToStringBuilder r3, org.apache.commons.lang3.builder.Diff r4) {
            java.lang.String r0 = r4.getFieldName()
            java.lang.Object r1 = r4.getLeft()
            r2.append(r0, r1)
            java.lang.String r2 = r4.getFieldName()
            java.lang.Object r4 = r4.getRight()
            r3.append(r2, r4)
            return
    }

    public java.util.List<org.apache.commons.lang3.builder.Diff<?>> getDiffs() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffList
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public T getLeft() {
            r1 = this;
            T r0 = r1.lhs
            return r0
    }

    public int getNumberOfDiffs() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffList
            int r0 = r0.size()
            return r0
    }

    public T getRight() {
            r1 = this;
            T r0 = r1.rhs
            return r0
    }

    public org.apache.commons.lang3.builder.ToStringStyle getToStringStyle() {
            r1 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r1.style
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>> iterator() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r1.diffList
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r1.style
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(org.apache.commons.lang3.builder.ToStringStyle r4) {
            r3 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r3.diffList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r4 = ""
            return r4
        Lb:
            org.apache.commons.lang3.builder.ToStringBuilder r0 = new org.apache.commons.lang3.builder.ToStringBuilder
            T r1 = r3.lhs
            r0.<init>(r1, r4)
            org.apache.commons.lang3.builder.ToStringBuilder r1 = new org.apache.commons.lang3.builder.ToStringBuilder
            T r2 = r3.rhs
            r1.<init>(r2, r4)
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r4 = r3.diffList
            org.apache.commons.lang3.builder.DiffResult$$ExternalSyntheticLambda0 r2 = new org.apache.commons.lang3.builder.DiffResult$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            r4.forEach(r2)
            java.lang.String r4 = r3.toStringFormat
            java.lang.String r0 = r0.build2()
            java.lang.String r1 = r1.build2()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r4 = java.lang.String.format(r4, r0)
            return r4
    }
}
