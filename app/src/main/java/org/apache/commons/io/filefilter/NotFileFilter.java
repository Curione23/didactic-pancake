package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class NotFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final org.apache.commons.io.filefilter.IOFileFilter filter;

    public NotFileFilter(org.apache.commons.io.filefilter.IOFileFilter r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "filter"
            java.util.Objects.requireNonNull(r2, r0)
            r1.filter = r2
            return
    }

    private java.nio.file.FileVisitResult not(java.nio.file.FileVisitResult r2) {
            r1 = this;
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.CONTINUE
            if (r2 != r0) goto L7
            java.nio.file.FileVisitResult r2 = java.nio.file.FileVisitResult.TERMINATE
            goto L9
        L7:
            java.nio.file.FileVisitResult r2 = java.nio.file.FileVisitResult.CONTINUE
        L9:
            return r2
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            org.apache.commons.io.filefilter.IOFileFilter r0 = r1.filter
            java.nio.file.FileVisitResult r2 = r0.accept(r2, r3)
            java.nio.file.FileVisitResult r2 = r1.not(r2)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r2) {
            r1 = this;
            org.apache.commons.io.filefilter.IOFileFilter r0 = r1.filter
            boolean r2 = r0.accept(r2)
            r2 = r2 ^ 1
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.io.filefilter.IOFileFilter r0 = r1.filter
            boolean r2 = r0.accept(r2, r3)
            r2 = r2 ^ 1
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NOT ("
            r0.<init>(r1)
            org.apache.commons.io.filefilter.IOFileFilter r1 = r2.filter
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
