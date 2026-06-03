package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class SymbolicLinkFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    public static final org.apache.commons.io.filefilter.SymbolicLinkFileFilter INSTANCE = null;
    private static final long serialVersionUID = 1;

    static {
            org.apache.commons.io.filefilter.SymbolicLinkFileFilter r0 = new org.apache.commons.io.filefilter.SymbolicLinkFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.SymbolicLinkFileFilter.INSTANCE = r0
            return
    }

    protected SymbolicLinkFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    public SymbolicLinkFileFilter(java.nio.file.FileVisitResult r1, java.nio.file.FileVisitResult r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            boolean r1 = r0.isSymbolicLink(r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            boolean r1 = r0.isSymbolicLink(r1)
            return r1
    }

    boolean isSymbolicLink(java.nio.file.Path r1) {
            r0 = this;
            boolean r1 = java.nio.file.Files.isSymbolicLink(r1)
            return r1
    }
}
