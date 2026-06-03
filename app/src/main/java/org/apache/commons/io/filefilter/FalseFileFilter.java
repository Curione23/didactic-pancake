package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class FalseFileFilter implements org.apache.commons.io.filefilter.IOFileFilter, java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter FALSE = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter INSTANCE = null;
    private static final java.lang.String TO_STRING = null;
    private static final long serialVersionUID = 6210271677940926200L;

    static {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r0 = r0.toString()
            org.apache.commons.io.filefilter.FalseFileFilter.TO_STRING = r0
            org.apache.commons.io.filefilter.FalseFileFilter r0 = new org.apache.commons.io.filefilter.FalseFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.FalseFileFilter.FALSE = r0
            org.apache.commons.io.filefilter.FalseFileFilter.INSTANCE = r0
            return
    }

    protected FalseFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.TERMINATE
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter r1) {
            r0 = this;
            org.apache.commons.io.filefilter.IOFileFilter r1 = org.apache.commons.io.filefilter.FalseFileFilter.INSTANCE
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter negate() {
            r1 = this;
            org.apache.commons.io.filefilter.IOFileFilter r0 = org.apache.commons.io.filefilter.TrueFileFilter.INSTANCE
            return r0
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter r1) {
            r0 = this;
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = org.apache.commons.io.filefilter.FalseFileFilter.TO_STRING
            return r0
    }
}
