package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class EmptyFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    public static final org.apache.commons.io.filefilter.IOFileFilter EMPTY = null;
    public static final org.apache.commons.io.filefilter.IOFileFilter NOT_EMPTY = null;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
            org.apache.commons.io.filefilter.EmptyFileFilter r0 = new org.apache.commons.io.filefilter.EmptyFileFilter
            r0.<init>()
            org.apache.commons.io.filefilter.EmptyFileFilter.EMPTY = r0
            org.apache.commons.io.filefilter.IOFileFilter r0 = r0.negate()
            org.apache.commons.io.filefilter.EmptyFileFilter.NOT_EMPTY = r0
            return
    }

    protected EmptyFileFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            if (r1 != 0) goto L8
            r1 = 1
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
        L8:
            org.apache.commons.io.filefilter.EmptyFileFilter$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.filefilter.EmptyFileFilter$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            java.nio.file.FileVisitResult r1 = r0.get(r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r8) {
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isDirectory()
            r2 = 0
            if (r1 == 0) goto L18
            java.io.File[] r8 = r8.listFiles()
            int r8 = org.apache.commons.io.IOUtils.length(r8)
            if (r8 != 0) goto L16
            goto L17
        L16:
            r0 = r2
        L17:
            return r0
        L18:
            long r3 = r8.length()
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L24
        L23:
            r0 = r2
        L24:
            return r0
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-EmptyFileFilter, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2595lambda$accept$0$orgapachecommonsiofilefilterEmptyFileFilter(java.nio.file.Path r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            boolean r1 = java.nio.file.Files.isDirectory(r8, r1)
            r2 = 1
            if (r1 == 0) goto L2d
            java.util.stream.Stream r8 = java.nio.file.Files.list(r8)
            java.util.Optional r0 = r8.findFirst()     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L21
            r0 = r0 ^ r2
            java.nio.file.FileVisitResult r0 = r7.toFileVisitResult(r0)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L20
            r8.close()
        L20:
            return r0
        L21:
            r0 = move-exception
            if (r8 == 0) goto L2c
            r8.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r8 = move-exception
            r0.addSuppressed(r8)
        L2c:
            throw r0
        L2d:
            long r3 = java.nio.file.Files.size(r8)
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L38
            r0 = r2
        L38:
            java.nio.file.FileVisitResult r8 = r7.toFileVisitResult(r0)
            return r8
    }
}
