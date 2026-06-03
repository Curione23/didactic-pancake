package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class DirectoryFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter DIRECTORY = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter INSTANCE = null;
    private static final long serialVersionUID = -5148237843784525732L;

    static {
            org.apache.commons.io.filefilter.DirectoryFileFilter r0 = new org.apache.commons.io.filefilter.DirectoryFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY = r0
            org.apache.commons.io.filefilter.DirectoryFileFilter.INSTANCE = r0
            return
    }

    protected DirectoryFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            r3 = 0
            if (r2 == 0) goto Lc
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r3]
            boolean r2 = java.nio.file.Files.isDirectory(r2, r0)
            if (r2 == 0) goto Lc
            r3 = 1
        Lc:
            java.nio.file.FileVisitResult r2 = r1.toFileVisitResult(r3)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }
}
