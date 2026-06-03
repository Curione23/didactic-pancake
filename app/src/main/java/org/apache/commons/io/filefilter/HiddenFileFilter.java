package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class HiddenFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter HIDDEN = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter VISIBLE = null;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
            org.apache.commons.io.filefilter.HiddenFileFilter r0 = new org.apache.commons.io.filefilter.HiddenFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.HiddenFileFilter.HIDDEN = r0
            org.apache.commons.io.filefilter.IOFileFilter r0 = r0.negate()
            org.apache.commons.io.filefilter.HiddenFileFilter.VISIBLE = r0
            return
    }

    protected HiddenFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            org.apache.commons.io.filefilter.HiddenFileFilter$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.filefilter.HiddenFileFilter$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            java.nio.file.FileVisitResult r1 = r0.get(r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r1 = r1.isHidden()
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-HiddenFileFilter, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2596x3301f0b8(java.nio.file.Path r1) throws java.io.IOException {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r1 = java.nio.file.Files.isHidden(r1)
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }
}
