package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class PathEqualsFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter {
    private final java.nio.file.Path path;

    public PathEqualsFileFilter(java.nio.file.Path r1) {
            r0 = this;
            r0.<init>()
            r0.path = r1
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r2 = r0.path
            boolean r1 = java.util.Objects.equals(r2, r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r2) {
            r1 = this;
            java.nio.file.Path r0 = r1.path
            java.nio.file.Path r2 = r2.toPath()
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }
}
