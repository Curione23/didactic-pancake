package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class FileEqualsFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter {
    private final java.io.File file;
    private final java.nio.file.Path path;

    public FileEqualsFileFilter(java.io.File r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "file"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            java.io.File r0 = (java.io.File) r0
            r1.file = r0
            java.nio.file.Path r2 = r2.toPath()
            r1.path = r2
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
            java.io.File r0 = r1.file
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }
}
