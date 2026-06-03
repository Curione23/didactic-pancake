package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
public class SizeFileComparator extends org.apache.commons.io.comparator.AbstractFileComparator implements java.io.Serializable {
    public static final java.util.Comparator<java.io.File> SIZE_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> SIZE_REVERSE = null;
    public static final java.util.Comparator<java.io.File> SIZE_SUMDIR_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> SIZE_SUMDIR_REVERSE = null;
    private static final long serialVersionUID = -1201561106411416190L;
    private final boolean sumDirectoryContents;

    static {
            org.apache.commons.io.comparator.SizeFileComparator r0 = new org.apache.commons.io.comparator.SizeFileComparator
            r0.<init>()
            org.apache.commons.io.comparator.SizeFileComparator.SIZE_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.SizeFileComparator.SIZE_REVERSE = r1
            org.apache.commons.io.comparator.SizeFileComparator r0 = new org.apache.commons.io.comparator.SizeFileComparator
            r1 = 1
            r0.<init>(r1)
            org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.SizeFileComparator.SIZE_SUMDIR_REVERSE = r1
            return
    }

    public SizeFileComparator() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.sumDirectoryContents = r0
            return
    }

    public SizeFileComparator(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.sumDirectoryContents = r1
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.io.File r6, java.io.File r7) {
            r5 = this;
            boolean r0 = r6.isDirectory()
            r1 = 0
            if (r0 == 0) goto L19
            boolean r0 = r5.sumDirectoryContents
            if (r0 == 0) goto L17
            boolean r0 = r6.exists()
            if (r0 == 0) goto L17
            long r3 = org.apache.commons.io.FileUtils.sizeOfDirectory(r6)
            goto L1d
        L17:
            r3 = r1
            goto L1d
        L19:
            long r3 = r6.length()
        L1d:
            boolean r6 = r7.isDirectory()
            if (r6 == 0) goto L34
            boolean r6 = r5.sumDirectoryContents
            if (r6 == 0) goto L32
            boolean r6 = r7.exists()
            if (r6 == 0) goto L32
            long r6 = org.apache.commons.io.FileUtils.sizeOfDirectory(r7)
            goto L38
        L32:
            r6 = r1
            goto L38
        L34:
            long r6 = r7.length()
        L38:
            long r3 = r3 - r6
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 >= 0) goto L3f
            r6 = -1
            return r6
        L3f:
            if (r6 <= 0) goto L43
            r6 = 1
            return r6
        L43:
            r6 = 0
            return r6
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
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[sumDirectoryContents="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.sumDirectoryContents
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
