package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class TrueFileFilter implements org.apache.commons.io.filefilter.IOFileFilter, java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter INSTANCE = null;
    private static final java.lang.String TO_STRING = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter TRUE = null;
    private static final long serialVersionUID = 8782512160909720199L;

    static {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r0 = r0.toString()
            org.apache.commons.io.filefilter.TrueFileFilter.TO_STRING = r0
            org.apache.commons.io.filefilter.TrueFileFilter r0 = new org.apache.commons.io.filefilter.TrueFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.TrueFileFilter.TRUE = r0
            org.apache.commons.io.filefilter.TrueFileFilter.INSTANCE = r0
            return
    }

    protected TrueFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter r1) {
            r0 = this;
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter negate() {
            r1 = this;
            org.apache.commons.io.filefilter.IOFileFilter r0 = org.apache.commons.io.filefilter.FalseFileFilter.INSTANCE
            return r0
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter r1) {
            r0 = this;
            org.apache.commons.io.filefilter.IOFileFilter r1 = org.apache.commons.io.filefilter.TrueFileFilter.INSTANCE
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = org.apache.commons.io.filefilter.TrueFileFilter.TO_STRING
            return r0
    }
}
