package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class CanExecuteFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter CANNOT_EXECUTE = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter CAN_EXECUTE = null;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
            org.apache.commons.io.filefilter.CanExecuteFileFilter r0 = new org.apache.commons.io.filefilter.CanExecuteFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.CanExecuteFileFilter.CAN_EXECUTE = r0
            org.apache.commons.io.filefilter.IOFileFilter r0 = r0.negate()
            org.apache.commons.io.filefilter.CanExecuteFileFilter.CANNOT_EXECUTE = r0
            return
    }

    protected CanExecuteFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = java.nio.file.Files.isExecutable(r1)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto La
            boolean r1 = r1.canExecute()
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }
}
