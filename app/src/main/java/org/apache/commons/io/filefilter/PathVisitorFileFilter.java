package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class PathVisitorFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter {
    private final org.apache.commons.io.file.PathVisitor pathVisitor;

    public PathVisitorFileFilter(org.apache.commons.io.file.PathVisitor r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            org.apache.commons.io.file.NoopPathVisitor r1 = org.apache.commons.io.file.NoopPathVisitor.INSTANCE
        L7:
            r0.pathVisitor = r1
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            org.apache.commons.io.filefilter.PathVisitorFileFilter$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.filefilter.PathVisitorFileFilter$$ExternalSyntheticLambda0
            r0.<init>(r1, r2, r3)
            java.nio.file.FileVisitResult r2 = r1.get(r0)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            java.nio.file.Path r2 = r4.toPath()     // Catch: java.io.IOException -> L1d
            boolean r4 = r4.exists()     // Catch: java.io.IOException -> L1d
            if (r4 == 0) goto L11
            java.nio.file.attribute.BasicFileAttributes r4 = org.apache.commons.io.file.PathUtils.readBasicFileAttributes(r2)     // Catch: java.io.IOException -> L1d
            goto L12
        L11:
            r4 = 0
        L12:
            java.nio.file.FileVisitResult r4 = r3.visitFile2(r2, r4)     // Catch: java.io.IOException -> L1d
            java.nio.file.FileVisitResult r2 = java.nio.file.FileVisitResult.CONTINUE     // Catch: java.io.IOException -> L1d
            if (r4 != r2) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            return r0
        L1d:
            r4 = move-exception
            java.nio.file.FileVisitResult r4 = r3.handle(r4)
            java.nio.file.FileVisitResult r2 = java.nio.file.FileVisitResult.CONTINUE
            if (r4 != r2) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            return r0
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r3, java.lang.String r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.nio.file.Path r3 = r3.toPath()     // Catch: java.io.IOException -> L19
            java.nio.file.Path r3 = r3.resolve(r4)     // Catch: java.io.IOException -> L19
            java.nio.file.attribute.BasicFileAttributes r4 = org.apache.commons.io.file.PathUtils.readBasicFileAttributes(r3)     // Catch: java.io.IOException -> L19
            java.nio.file.FileVisitResult r3 = r2.accept(r3, r4)     // Catch: java.io.IOException -> L19
            java.nio.file.FileVisitResult r4 = java.nio.file.FileVisitResult.CONTINUE     // Catch: java.io.IOException -> L19
            if (r3 != r4) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            return r0
        L19:
            r3 = move-exception
            java.nio.file.FileVisitResult r3 = r2.handle(r3)
            java.nio.file.FileVisitResult r4 = java.nio.file.FileVisitResult.CONTINUE
            if (r3 != r4) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            return r0
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-PathVisitorFileFilter, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2598xba762e63(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.isDirectory(r2, r0)
            if (r0 == 0) goto L11
            org.apache.commons.io.file.PathVisitor r3 = r1.pathVisitor
            r0 = 0
            java.nio.file.FileVisitResult r2 = r3.postVisitDirectory(r2, r0)
            goto L15
        L11:
            java.nio.file.FileVisitResult r2 = r1.visitFile2(r2, r3)
        L15:
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.visitFile2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    /* JADX INFO: renamed from: visitFile, reason: avoid collision after fix types in other method */
    public java.nio.file.FileVisitResult visitFile2(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.file.PathVisitor r0 = r1.pathVisitor
            java.nio.file.FileVisitResult r2 = r0.visitFile(r2, r3)
            return r2
    }
}
