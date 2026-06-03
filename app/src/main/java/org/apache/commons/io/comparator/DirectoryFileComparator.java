package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
public class DirectoryFileComparator extends org.apache.commons.io.comparator.AbstractFileComparator implements java.io.Serializable {
    public static final java.util.Comparator<java.io.File> DIRECTORY_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> DIRECTORY_REVERSE = null;
    private static final int TYPE_DIRECTORY = 1;
    private static final int TYPE_FILE = 2;
    private static final long serialVersionUID = 296132640160964395L;

    static {
            org.apache.commons.io.comparator.DirectoryFileComparator r0 = new org.apache.commons.io.comparator.DirectoryFileComparator
            r0.<init>()
            org.apache.commons.io.comparator.DirectoryFileComparator.DIRECTORY_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.DirectoryFileComparator.DIRECTORY_REVERSE = r1
            return
    }

    public DirectoryFileComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    private int getType(java.io.File r1) {
            r0 = this;
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 2
        L9:
            return r1
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.io.File r1, java.io.File r2) {
            r0 = this;
            int r1 = r0.getType(r1)
            int r2 = r0.getType(r2)
            int r1 = r1 - r2
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
