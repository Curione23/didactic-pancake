package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultFileComparator extends org.apache.commons.io.comparator.AbstractFileComparator implements java.io.Serializable {
    public static final java.util.Comparator<java.io.File> DEFAULT_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> DEFAULT_REVERSE = null;
    private static final long serialVersionUID = 3260141861365313518L;

    static {
            org.apache.commons.io.comparator.DefaultFileComparator r0 = new org.apache.commons.io.comparator.DefaultFileComparator
            r0.<init>()
            org.apache.commons.io.comparator.DefaultFileComparator.DEFAULT_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.DefaultFileComparator.DEFAULT_REVERSE = r1
            return
    }

    public DefaultFileComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.io.File r1, java.io.File r2) {
            r0 = this;
            int r1 = r1.compareTo(r2)
            return r1
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
    public /* bridge */ /* synthetic */ java.util.List sort(java.util.List r1) {
            r0 = this;
            java.util.List r1 = super.sort(r1)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ java.io.File[] sort(java.io.File[] r1) {
            r0 = this;
            java.io.File[] r1 = super.sort(r1)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
