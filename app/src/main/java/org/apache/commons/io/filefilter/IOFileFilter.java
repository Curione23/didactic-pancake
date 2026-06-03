package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public interface IOFileFilter extends java.io.FileFilter, java.io.FilenameFilter, org.apache.commons.io.file.PathFilter, java.nio.file.PathMatcher {
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY = r0
            return
    }

    default java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            if (r1 == 0) goto Le
            java.io.File r1 = r1.toFile()
            boolean r1 = r0.accept(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.nio.file.FileVisitResult r1 = org.apache.commons.io.filefilter.AbstractFileFilter.toDefaultFileVisitResult(r1)
            return r1
    }

    @Override // java.io.FileFilter
    boolean accept(java.io.File r1);

    boolean accept(java.io.File r1, java.lang.String r2);

    default org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter r2) {
            r1 = this;
            org.apache.commons.io.filefilter.AndFileFilter r0 = new org.apache.commons.io.filefilter.AndFileFilter
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.nio.file.PathMatcher
    default boolean matches(java.nio.file.Path r2) {
            r1 = this;
            r0 = 0
            java.nio.file.FileVisitResult r2 = r1.accept(r2, r0)
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.TERMINATE
            if (r2 == r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    default org.apache.commons.io.filefilter.IOFileFilter negate() {
            r1 = this;
            org.apache.commons.io.filefilter.NotFileFilter r0 = new org.apache.commons.io.filefilter.NotFileFilter
            r0.<init>(r1)
            return r0
    }

    default org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter r2) {
            r1 = this;
            org.apache.commons.io.filefilter.OrFileFilter r0 = new org.apache.commons.io.filefilter.OrFileFilter
            r0.<init>(r1, r2)
            return r0
    }
}
