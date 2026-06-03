package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
final class ReverseFileComparator extends org.apache.commons.io.comparator.AbstractFileComparator implements java.io.Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final java.util.Comparator<java.io.File> delegate;

    public ReverseFileComparator(java.util.Comparator<java.io.File> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.Comparator r2 = (java.util.Comparator) r2
            r1.delegate = r2
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.io.File r2, java.io.File r3) {
            r1 = this;
            java.util.Comparator<java.io.File> r0 = r1.delegate
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = (java.io.File) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Comparator<java.io.File> r1 = r2.delegate
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
